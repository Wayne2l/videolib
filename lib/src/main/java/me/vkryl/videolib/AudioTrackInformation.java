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

/**
 * Information about audio track.
 */
public class AudioTrackInformation {
  /**
   * Audio bitrate.
   *
   * In real world usage scenario this field will be equal to {@link VideoLibraryConstants#BITRATE_UNSET} and must be chosen
   * by the library depending on the video file and the device available codec set and their properties.
   *
   * However, this option is needed for the testing purposes to be able to measure the performance when generating the same output video by different {@link VideoLibrary} implementations.
   */
  public long bitrate = VideoLibraryConstants.BITRATE_UNSET;

  /**
   * Audio sample rate.
   *
   * In real world usage scenario this field will be equal to {@link VideoLibraryConstants#SAMPLE_RATE_UNSET} and must be chosen
   * by the library depending on the video file and the device available codec set and their properties.
   *
   * However, this option is needed for the testing purposes to be able to measure the performance when generating the same output video by different {@link VideoLibrary} implementations.
   */
  public long sampleRate = VideoLibraryConstants.SAMPLE_RATE_UNSET;

  /**
   * Audio codec.
   *
   * In real world usage scenario this field will be equal to <code>null</code> and must be chosen
   * by the library depending on the video file and the device available codec set and their properties.
   *
   * However, this option is needed for the testing purposes to be able to measure the performance when generating the same output video by different {@link VideoLibrary} implementations.
   */
  public String codecId = null;

}
