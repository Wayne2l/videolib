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
import android.graphics.Rect;
import android.net.Uri;

import java.util.List;

/**
 * Instructions on how to convert the input video file to the output video file.
 *
 * Used by:
 * - {@link VideoLibrary#convertVideo(Context, Uri, OutputVideoConfiguration, OverlayProvider, String, ConversionCallback)}
 * - {@link VideoLibrary#generateThumbnail(Context, Uri, int, OutputVideoConfiguration, OverlayProvider, Callback)}
 */
public class OutputVideoConfiguration {
  /**
   * Crop area.
   *
   * Coordinates correspond to the original video resolution <b>without</b> rotation metadata being applied.
   */
  public Rect cropArea;

  /**
   * Compression parameters.
   *
   * Video resolution aspect ratio inside {@link CompressionConfiguration#videoCompression} must match the
   *
   * <code>null</code>, if original quality should be preserved.
   */
  public CompressionConfiguration compression;

  /**
   * Trim parameters
   *
   * <code>null</code> if no trimming should be applied.
   */
  public TimeSegment trim;

  /**
   * True, if audio tracks should be removed (if any).
   */
  public boolean removeAudioTracks;

  /**
   * True, if subtitle tracks should be kept in the output container.
   */
  public boolean keepSubtitleTracks;

  /**
   * True, if the demo video for the given parameters should be generated.
   *
   * This demo video will be shown to the user when they select the video quality,
   * therefore it must be limited by duration.
   *
   * The exact demo video content and duration is a subject of the {@link VideoLibrary} implementation's choice,
   * but keep in mind that demo should be generated within a reasonable time,
   * and the output file shouldn't take much space.
   *
   * We recommend taking between 5-15 seconds from the beginning of the video,
   * or taking several 5-second video segments (beginning, middle, and the end)
   * and merging them into one clip.
   */
  public boolean isQualityDemo;

  /**
   * List of video overlays.
   */
  public List<OverlayInformation> overlays;
}
