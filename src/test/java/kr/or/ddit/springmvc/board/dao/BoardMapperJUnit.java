//package kr.or.ddit.springmvc.board.dao;
//
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import kr.or.ddit.springmvc.board.vo.BoardVO;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//		 "/egovframework/spring/context-common.xml"
//		,"/egovframework/spring/context-datasource.xml"
//		,"/egovframework/spring/context-mapper.xml"
//})
//public class BoardMapperJUnit {
//	private static final Logger LOGGER = LoggerFactory.getLogger(BoardMapperJUnit.class);
//	
//	@Resource(name="boardMapper")
//	private BoardMapper boardMapper;
//	
//	@Test
//	public void retrieveListTest() throws Exception {
//		BoardVO paramBoardVO = new BoardVO();
//		List<BoardVO> boardList =  boardMapper.retrieveList(paramBoardVO);
//		for(BoardVO boardVO : boardList) {
//			LOGGER.info(boardVO.getContents());
//		}
//		assertTrue(boardList.size()>0);
//	}
//	
//	@Test
//	public void createTest() throws Exception {
//		BoardVO paramBoardVO = new BoardVO();
//		
//		for(int i = 0; i<300; i++) {
//			paramBoardVO.setTitle(i+"제목 입력");
//			paramBoardVO.setContents(i+"내용");
//			paramBoardVO.setWriter(i+"테스터");
//			paramBoardVO.setUserPassword("1234");
//			paramBoardVO.setOpenYn("Y");
//			
//			LOGGER.info(paramBoardVO.getContents());
//			boardMapper.create(paramBoardVO);
//		}
//		assertNotNull(paramBoardVO.getBoardSn());
//	}
//	
//	@Test
//	public void updateTest() throws Exception {
//		BoardVO paramBoardVO = new BoardVO();
//		
//		paramBoardVO.setBoardSn("300");
//		paramBoardVO.setTitle("제목 수정");
//		paramBoardVO.setContents("내용 수정");
//		paramBoardVO.setWriter("관리자");
//		paramBoardVO.setUserPassword("1111");
//		paramBoardVO.setOpenYn("N");
//		
//		LOGGER.info(paramBoardVO.getContents());
//		
//		int updateCnt = boardMapper.update(paramBoardVO);
//		assertTrue(updateCnt>0);
//	}
//	
//	@Test
//	public void deleteTest() throws Exception {
//		BoardVO paramBoardVO = new BoardVO();
//		
//		paramBoardVO.setBoardSn("6");
//		int deleteCnt = boardMapper.delete(paramBoardVO);
//		
//		LOGGER.info(paramBoardVO.getContents());
//		
//		assertTrue(deleteCnt>0);
//	}
//	
//	@Test
//	public void retrieveTest() throws Exception {
//		BoardVO paramBoardVO = new BoardVO();
//		
//		paramBoardVO.setBoardSn("300");
//		BoardVO retrieveBoardVO = boardMapper.retrieve(paramBoardVO);
//		
//		LOGGER.info("retrieveBoardVO : " + retrieveBoardVO);
//		
//		assertNotNull(retrieveBoardVO);
//	}
//	
//}
