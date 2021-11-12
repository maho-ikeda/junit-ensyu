package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import domain.Member;

@Repository
public class MemberRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Member> ME_ROW_MAPPER = (rs, i) -> {
		Member member = new Member();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));
		return member;
	};
	
	/**
	 * 全件検索を行う
	 * @return メンバーリスト
	 */
	public List<Member> findall() {
		String sql = "SELECT id, name, age FROM member ORDER BY id";
		
		List<Member> memberList = template.query(sql, ME_ROW_MAPPER);
		return memberList;
	}
}
