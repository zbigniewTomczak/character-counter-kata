import org.junit.Assert;
import org.junit.Test;

public class CharacterCounterTest {
	@org.junit.Test
	public void counter_stringA_returnOne() throws Exception {
		CharacterCounter counter = new CharacterCounter("A");
		int countA = counter.count('A');
		Assert.assertEquals(1, countA);
	}

	@Test
	public void count_stringAA_returnTwo() throws Exception {
		CharacterCounter counter = new CharacterCounter("AA");
		int countA = counter.count('A');
		Assert.assertEquals(2, countA);
	}

//	@Test
//	public void count_stringAA_returnsZeroForB() throws Exception {
//		CharacterCounter counter = new CharacterCounter("AA");
//		int countB = counter.count('B');
//		Assert.assertEquals(0, countB);
//	}
}
