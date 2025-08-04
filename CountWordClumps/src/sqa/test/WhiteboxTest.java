package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.junit.jupiter.api.BeforeEach;

import sqa.main.CountWordClumps;

class WhiteboxTest{
	
	CountWordClumps count;
	
	@BeforeEach
	public void setup() throws Exception {
		count = new CountWordClumps();
	}
	
	@ParameterizedTest
	@MethodSource("Whiteboxtestcase")
	void TestValidcase(int[] Input, int ExpectResult) {
		assertEquals(CountWordClumps.countClumps(Input), ExpectResult);
	}
	
	static Stream<Arguments> Whiteboxtestcase() {
		return Stream.of(
				Arguments.arguments(null,0),
				Arguments.arguments(new int[] {},0),
				Arguments.arguments(new int[] {1},0),
				Arguments.arguments(new int[] {1, 2},0),
				Arguments.arguments(new int[] {1, 1},1)
				);
	}
}