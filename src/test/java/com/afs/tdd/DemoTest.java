package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoTest {
    @Test
    void should_goto_01N_when_changePos_given_00N_and_M() {
        // Given
        String curPos = "0 0 N";
        char operateCode = 'M';
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCode);
        // Then
        assertThat(finalPos).isEqualTo("0 1 N");
    }

    @Test
    void should_goto_10E_when_changePos_given_00W_and_M() {
        // Given
        String curPos = "0 0 E";
        char operateCode = 'M';
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCode);
        // Then
        assertThat(finalPos).isEqualTo("1 0 E");
    }

    @Test
    void should_goto_00W_when_changePos_given_00N_and_L() {
        // Given
        String curPos = "0 0 N";
        char operateCode = 'L';
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCode);
        // Then
        assertThat(finalPos).isEqualTo("0 0 W");
    }

    @Test
    void should_goto_00N_when_changePos_given_00N_and_R() {
        // Given
        String curPos = "0 0 N";
        char operateCode = 'R';
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCode);
        // Then
        assertThat(finalPos).isEqualTo("0 0 E");
    }

    @Test
    void should_goto_02N_when_changePos_given_00N_and_MM() {
        // Given
        String curPos = "0 0 N";
        char[] operateCodes = {'M', 'M'};
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCodes);
        // Then
        assertThat(finalPos).isEqualTo("0 2 N");
    }

    @Test
    void should_goto_n11W_when_changePos_given_00N_and_MLM() {
        // Given
        String curPos = "0 0 N";
        char[] operateCodes = {'M', 'L', 'M'};
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCodes);
        // Then
        assertThat(finalPos).isEqualTo("-1 1 W");
    }

    @Test
    void should_goto_0n1N_when_changePos_given_n1n2S_and_MLMLMM() {
        // Given
        String curPos = "-1 -2 S";
        char[] operateCodes = {'M', 'L', 'M', 'L', 'M', 'M'};
        // When
        String finalPos = PostionUtil.getFinalPos(curPos, operateCodes);
        // Then
        assertThat(finalPos).isEqualTo("0 -1 N");
    }
}
