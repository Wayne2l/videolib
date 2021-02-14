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

/**
 * Callback interface to notify about the conversion status and progress.
 */
public interface ConversionCallback {
  /**
   * Notifies that conversion has been started
   *
   * @param taskId Task identifier of the conversion
   */
  void onConversionStarted (long taskId);

  /**
   *
   * @param taskId Task identifier of the conversion
   * @param estimatedFinalFileSize up-to-date estimation of the final file size
   * @param progressPercentage progress percentage
   * @param bytesReadyToUpload amount of bytes that could be uploaded from the file to the server and won't change after file generation will be finished
   */
  void onConversionProgress (long taskId, long estimatedFinalFileSize, double progressPercentage, long bytesReadyToUpload);

  /**
   *
   * @param taskId Task identifier of the conversion
   * @param error Non-null when conversion finished unsuccessfully.
   */
  void onConversionFinish (long taskId, @Nullable Throwable error);

  /**
   * Invoked when conversion needs to be restarted (e.g. because of the failure of the first attempt), and previously provided "bytesReadyToUpload" value became invalid
   *
   * @param taskId task identifier of the conversion
   * @param error Error for logging and error reporting, if applicable
   * */
  void onConversionRestart (long taskId, @Nullable Throwable error);
}
