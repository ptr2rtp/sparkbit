package stack.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StackDemoApplicationTests {

	@Test
	void shouldReturnShortestElement() {

		Stack s = new Stack();

		s.push("fst");
		s.push("second");
		s.push("thirdthirdthird");
		s.push("four");
		s.push("five");

		assertEquals("fst", s.shortest());

	}

	@Test
	void shouldPopLastElement() {

		Stack s = new Stack();

		s.push("fst");
		s.push("second");
		s.push("fortyfourandfive");
		s.push("fst");
		s.push("fst");

		s.push("lastElement");

		assertEquals("lastElement", s.pop());

	}

}
