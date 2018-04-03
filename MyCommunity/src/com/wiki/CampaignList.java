package com.wiki;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CampaignList
 */
@WebServlet("/CampaignList")
public class CampaignList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampaignList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html;charset=utf-8"); 
		response.setCharacterEncoding("utf-8"); 
		System.out.println(request.toString());
		String json = "{\"result\":\"1\",\"msg\":\"2\","
				+ "\"data\":[{\"campaign_id\":\"1\",\"campaign_name\":\"智能社区完成C1轮融资，预期C轮完成1.5亿美元融资\",\"campaign_desc\":\"fake news，233333333\""
				+ ",\"campaign_address\":\"Northeasten University\","
				+ "\"longitude\":\"1\",\"latitude\":\"1\",\"remark\":\"remark\",\"dict_id\":\"11\","
				+"\"start_time\":\"2018-2-29 00:00:00\",\"end_time\":\"2018-2-30 00:00:00\",\"campaign_integral\":\"1\""
				+ ",\"status\":\"1\",\"is_recommand\":\"1\",\"user_id\":\"347552913\",\"create_time\":\"2018-2-31 00:00:00\""
				+",\"comment_count\":\"1\",\"praise_count\":\"999\",\"nickname\":\"Wiki\""
				+",\"head_img\":\"https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2179665873,1149625952&fm=27&gp=0.jpg\""
				+",\"dict_name\":\"Kiwi\",\"is_praise\":\"1\"}]}";
		response.getWriter().append(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
