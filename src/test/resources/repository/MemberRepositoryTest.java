package repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.Member;

class MemberRepositoryTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("メンバー一覧の情報が一致している")
	void testFindall() {
		
		List<Member> expectedList = new ArrayList();
		Member member1 = new Member();
		member1.setId(1);
		member1.setName("hoge");
		member1.setAge(19);
		Member member2 = new Member();
		member2.setId(2);
		member2.setName("fuga");
		member2.setAge(20);
		Member member3 = new Member();
		member3.setId(3);
		member3.setName("piyo");
		member3.setAge(21);
		expectedList.set(0, member1);
		expectedList.set(1, member2);
		expectedList.set(2, member3);
		MemberRepository memberRepository = new MemberRepository();
		List<Member> actuList = memberRepository.findall();
		
		assertThat(expectedList, is(actuList));
	}

}
