import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterCounterTest {
	@Test
	public void count_stringA_returnOne() {
		CharacterCounter counter = new CharacterCounter("A");
		int countA = counter.count('A');
		assertEquals(1, countA);
	}

	@Test
	public void count_stringAA_returnTwo() {
		CharacterCounter counter = new CharacterCounter("AA");
		int countA = counter.count('A');
		assertEquals(2, countA);
	}

	@Test
	public void count_stringAA_returnsZeroForB(){
		CharacterCounter counter = new CharacterCounter("AA");
		int countB = counter.count('B');
		assertEquals(0, countB);
	}
}
