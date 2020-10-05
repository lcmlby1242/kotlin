/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.debugInformation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/localVariables")
@TestDataPath("$PROJECT_ROOT")
@RunWith(BlockJUnit4ClassRunner.class)
public class IrLocalVariableTestGenerated extends AbstractIrLocalVariableTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    @Test
    public void testAllFilesPresentInLocalVariables() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("catchClause.kt")
    public void testCatchClause() throws Exception {
        runTest("compiler/testData/debug/localVariables/catchClause.kt");
    }

    @Test
    @TestMetadata("copyFunction.kt")
    public void testCopyFunction() throws Exception {
        runTest("compiler/testData/debug/localVariables/copyFunction.kt");
    }

    @Test
    @TestMetadata("destructuringInFor.kt")
    public void testDestructuringInFor() throws Exception {
        runTest("compiler/testData/debug/localVariables/destructuringInFor.kt");
    }

    @Test
    @TestMetadata("destructuringInLambdas.kt")
    public void testDestructuringInLambdas() throws Exception {
        runTest("compiler/testData/debug/localVariables/destructuringInLambdas.kt");
    }

    @Test
    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("compiler/testData/debug/localVariables/localFun.kt");
    }

    @Test
    @TestMetadata("underscoreNames.kt")
    public void testUnderscoreNames() throws Exception {
        runTest("compiler/testData/debug/localVariables/underscoreNames.kt");
    }
}
