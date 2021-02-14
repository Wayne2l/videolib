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

import android.content.Context;
import android.net.Uri;

/**
 * Interface for holding any arbitrary library cache that might increase performance of the trim timestamp correction,
 * see {@link VideoLibrary#correctTrimSegment(Context, Uri, TimeSegmentsCache, TimeSegment, boolean, Callback)}.
 */
public interface TimeSegmentsCache {
  /**
   * Called once client doesn't need video information anymore and won't.
   */
  void releaseResources ();
}
