import org.junit.Assert;

public class CharacterCounterTest {
	@org.junit.Test
	public void counter_stringA_returnOne() throws Exception {
		CharacterCounter counter = new CharacterCounter("A");
		int countA = counter.count('A');
		Assert.assertEquals(1, countA);
	}

}
