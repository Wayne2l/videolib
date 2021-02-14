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

import androidx.annotation.Nullable;

import java.util.List;

/**
 * Provider of {@link Overlay}
 */
public interface OverlayProvider {
  /**
   * Creates an {@link Overlay} object.
   *
   *
   * @param scaledWidth Scaled overlay area width, after final resolution is applied to the video
   * @param scaledHeight Scaled overlay area height, after final resolution is applied to the video
   * @param parameters Parameters previously provided set by the client.
   * @param totalVideoFrameCount Total output video frame count.
   * @param videoFramesPerSecond Output video frame rate
   * @param isStaticPreview True, if only first frame will be needed.
   *
   * @return Overlay object, or null, if this overlay should be ignored.
   */
  @Nullable
  Overlay createOverlay (int scaledWidth, int scaledHeight, List<OverlayParameter> parameters, long totalVideoFrameCount, int videoFramesPerSecond, boolean isStaticPreview);
}
