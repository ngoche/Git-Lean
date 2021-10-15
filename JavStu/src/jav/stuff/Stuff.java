package jav.stuff;

public class Stuff {
	static String text = "Sở Y tế Hà Nội cho biết, từ 15/1 đến nay có hơn 1.500 người từ Cẩm Giàng (Hải Dương) về Hà Nội. TP Hà Nội sẽ xét nghiệm toàn bộ người dân từ Hải Dương về Hà Nội từ ngày 2/2 đến 16/2.\r\n"
			+ "Chiều ngày 17/2, báo cáo tại phiên họp Ban chỉ đạo phòng chống Covid-19 TP Hà Nội, ông Hoàng Đức Hạnh - Phó Giám đốc Sở Y tế Hà Nội cho biết, tính từ đầu tháng 1 đến nay, có hơn 18.000 người về Hà Nội từ Chí Linh (Hải Dương) và các ổ dịch tại tỉnh Quảng Ninh. Tất cả các trường hợp này đều đã được lấy mẫu xét nghiệm, trong đó có 4 trường hợp dương tính là bệnh nhân 1694, 1814, 1815 và 1819, còn lại là âm tính.\r\n"
			+ "\r\n"
			+ "Tính từ ngày 15/1 đến nay, TP Hà Nội đã rà soát được 1.517 người trở về từ huyện Cẩm Giàng (Hải Dương). Ngành y tế Hà Nội đã lấy mẫu xét nghiệm cho 1.150 người, trong đó có 437 người cho kết quả âm tính, số còn lại đang chờ kết quả. Hiện các lực lượng của Hà Nội đang khẩn trương rà soát và xét nghiệm cho người về từ vùng dịch theo đúng quy định.";
	public static void main(String[] args) {
		System.out.println(text.contains("TP Hà Nội"));
		System.out.println(text.indexOf("đến nay"));
	}
}