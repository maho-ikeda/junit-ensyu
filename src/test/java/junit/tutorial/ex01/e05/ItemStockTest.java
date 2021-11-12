package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
	@DisplayName("初期状態でgetNum()で0が取得できる")
	void testGetNum1() {
		Item item1 = new Item("本", 1000);
		ItemStock itemStock = new ItemStock();
		int expected = 0;
		int actual = itemStock.getNum(item1); 
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}

	@Test
	@DisplayName("初期状態でaddでitemを追加するとgetNumで1が取得できる")
	void testAdd1() {
		Item item1 = new Item("本", 1000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		int actual = itemStock.getNum(item1);
		int expected = 1;
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("itemが1つ追加された状態でgetNum()で1が取得できる")
	void testGetNum2() {
		Item item1 = new Item("本", 1000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		int expected = 1;
		int actual = itemStock.getNum(item1); 
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("itemが1つ追加された状態で、addで同じアイテムを追加するとgetNum()で2が取得できる")
	void testGetNum3() {
		Item item1 = new Item("本", 1000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		itemStock.add(item1);
		int expected = 2;
		int actual = itemStock.getNum(item1); 
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	@Test
	@DisplayName("itemが1つ追加された状態で、addで異なるアイテムを追加するとgetNum()で1が取得できる")
	void testGetNum4() {
		Item item1 = new Item("本", 1000);
		Item item2 = new Item("CD", 2000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item1);
		itemStock.add(item2);
		int expected = 1;
		int actual = itemStock.getNum(item2); 
		assertEquals(expected, actual, "期待値と実際の値が異なります");
	}
	
	

}
