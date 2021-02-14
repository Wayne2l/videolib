/*
 * This file is a part of VideoLibrary Interface
 * Copyright © Vyacheslav Krylov (slavone@protonmail.ch) 2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.vkryl.videolib;

import android.graphics.Canvas;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Overlay {
  @Retention(RetentionPolicy.SOURCE)
  @IntDef({
    StatusCode.FRAME_NOT_CHANGED,
    StatusCode.FRAME_CLEARED,
    StatusCode.FRAME_CHANGED
  })
  @interface StatusCode {
    /**
     * Means frame content has not changed from the last {@link #drawFrame(Canvas, int)} call.
     *
     * If it's returned from the first {@link #drawFrame(Canvas, int)} call, it means the frame is empty.
     */
    int FRAME_NOT_CHANGED = 0;

    /**
     * Means frame content should be entirely cleared
     */
    int FRAME_CLEARED = 1;

    /**
     * Means previous content should be
     */
    int FRAME_CHANGED = 2;
  }

  /**
   * @return True, if this overlay contains several frames.
   *         False, if this overlay has just one frame and never changes.
   */
  boolean isAnimated ();

  /**
   * @return For animated overlays – total frame count, throws {@link IllegalStateException} otherwise
   */
  default int getFrameCount () {
    if (!isAnimated())
      throw new IllegalStateException("Is not animated");
    throw new RuntimeException("Not implemented!");
  }

  /**
   * @return For animated overlays – amount of frames per second, throws {@link IllegalStateException} otherwise
   */
  default int getFramesPerSecond () {
    if (!isAnimated())
      throw new IllegalStateException("Is not animated");
    throw new RuntimeException("Not implemented!");
  }

  /**
   * @param canvas to draw on
   * @param frameIndex 0..{@link #getFrameCount()} - 1
   *
   * @return one of status codes, see {@link StatusCode}
   */
  int drawFrame (Canvas canvas, int frameIndex);

  /**
   * Must be called by the library once overlay instance is no longer needed
   */
  void releaseResources ();
}
