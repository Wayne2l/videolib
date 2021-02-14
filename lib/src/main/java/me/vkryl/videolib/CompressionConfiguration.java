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

/**
 * Compression parameters.
 */
public class CompressionConfiguration {
  /**
   * Parameters of the output video track after trim and crop was applied,
   * or <code>null</code> if video should not be changed.
   *
   * {@link VideoTrackInformation#width} and {@link VideoTrackInformation#height}
   * should be treated as maximum width and height.
   *
   * When odd or invalid values are passed, error should be generated.
   */
  public VideoTrackInformation videoCompression;

  /**
   * Parameters of the output audio track after trim was applied,
   * or <code>null</code> if audio should be removed or kept unchanged.
   */
  public AudioTrackInformation audioCompression;

  /**
   * Output video container.
   *
   * <code>null</code> or one of container identifier provided via {@link VideoLibrary#getSupportedFormats(Context, Callback)}
   *
   * In real world usage scenario this field will be equal to <code>null</code> and must be chosen
   * by the library depending on the video file and the device available codec set and their properties.
   *
   * However, this option is needed for the testing purposes to be able to measure the performance when generating the same output video by different {@link VideoLibrary} implementations.
   */
  public String containerId = null;
}
