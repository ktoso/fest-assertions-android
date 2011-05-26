/*
 * Created on Jan 16, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2011 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.fest.assertions.internal.Characters;
import org.junit.*;

/**
 * Tests for <code>{@link CharacterAssert#isGreaterThan(char)}</code>.
 *
 * @author Yvonne Wang
 */
public class CharacterAssert_isGreaterThan_char_Test {

  private Characters characters;
  private CharacterAssert assertions;

  @Before public void setUp() {
    characters = mock(Characters.class);
    assertions = new CharacterAssert('a');
    assertions.characters = characters;
  }

  @Test public void should_verify_that_actual_is_greater_than_expected() {
    assertions.isGreaterThan('b');
    verify(characters).assertGreaterThan(assertions.info, assertions.actual, 'b');
  }

  @Test public void should_return_this() {
    CharacterAssert returned = assertions.isGreaterThan('b');
    assertSame(assertions, returned);
  }
}
