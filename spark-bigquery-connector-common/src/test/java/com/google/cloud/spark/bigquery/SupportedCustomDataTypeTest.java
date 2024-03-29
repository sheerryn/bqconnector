/*
 * Copyright 2020 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.spark.bigquery;

import static com.google.common.truth.Truth.assertThat;

import java.util.Optional;
import org.apache.spark.ml.linalg.SQLDataTypes;
import org.junit.Test;

public class SupportedCustomDataTypeTest {

  @Test
  public void testVector() throws Exception {
    Optional<SupportedCustomDataType> vector =
        SupportedCustomDataType.of(SQLDataTypes.VectorType());
    assertThat(vector.isPresent()).isTrue();
  }

  @Test
  public void testMatrix() throws Exception {
    Optional<SupportedCustomDataType> matrix =
        SupportedCustomDataType.of(SQLDataTypes.MatrixType());
    assertThat(matrix.isPresent()).isTrue();
  }
}
