/*
 * Copyright (C) 2013 ZeroTurnaround <support@zeroturnaround.com>
 * Contains fragments of code from Apache Commons Exec, rights owned
 * by Apache Software Foundation (ASF).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zeroturnaround.exec.stream;

import org.slf4j.Logger;

/**
 * Output stream that writes <code>debug</code> level messages to a given {@link Logger}.
 *
 * @author Rein Raudjärv
 */
public class Slf4jDebugOutputStream extends LogOutputStream {

  private final Logger log;

  public Slf4jDebugOutputStream(Logger logger) {
    this.log = logger;
  }

  @Override
  protected void processLine(String line) {
    log.debug(line);
  }

}