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
 * Contains information about estimated output video file size
 */
public class EstimatedOutputSize {
  /**
   * Estimated total output file size.
   *
   * This value must be greater or equal to
   * the sum of {@link #videoSize}, {@link #audioSize}, {@link #subtitlesSize}.
   */
  public long totalSize;

  /**
   * Estimated amount of bytes video track takes of the {@link #totalSize}.
   */
  public long videoSize;

  /**
   * Estimated amount of bytes audio tracks take of the {@link #totalSize}.
   *
   * This value might be used to display user how output size will change after disabling audio track:
   * <code>long sizeWithoutAudio = {@link #totalSize} – audioSize;</code>
   */
  public long audioSize;

  /**
   * Estimated amount of bytes subtitle tracks take of the {@link #totalSize}.
   *
   * This value might be used to display user how output size will change after disabling subtitles:
   * <code>long sizeWithoutSubtitles = {@link #totalSize} – subtitlesSize;</code>
   */
  public long subtitlesSize;
}
