package io.weather.enumtest;

public enum WeekDay {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
	
	private int day;
	private WeekDay(int day) {
		// TODO Auto-generated constructor stub
		this.day = day;
	}
	public static int a = 1;
	public static void main(String[] args) {
		WeekDay[] allday = WeekDay.values();
		for (WeekDay day: allday) {
			System.out.println(day);
			System.out.println(day.getDay());
		}
		System.out.println(WeekDay.a);
	}
	
	public int getDay() {
		return day;
	}
}
