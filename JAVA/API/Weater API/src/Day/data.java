package Day;

public class data {

	/** 
	* data : {"realtime":{"city_code":"101200801","city_name":"����","date":"2019-10-16","time":"20:00:00","week":"3","moon":"����ʮ��","dataUptime":"1571228547","weather":{"temperature":"12","humidity":"90","info":"����","img":"01"},"wind":{"direct":"����","power":"3��"}},"life":{"date":"2019-10-16","info":{"kongtiao":["���ٿ���","�����е������ʣ�һ�㲻��Ҫ�����յ���"],"guomin":["�׷�","�����������շ��������н�ˮ���׹�����ȺӦ������������������ô����³��㣬Ԥ����ð���������Ĺ�����"],"shushidu":["������","������н��꣬���ǻ�е���Щ���⣬���󲿷�����ȫ���Խ��ܡ�"],"chuanyi":["����","�����ź����׼�ë�µȷ�װ���������������Ŵ��¡������׼���ë����"],"diaoyu":["����","��ǰһ���нϴ��£����ʺϴ�����"],"ganmao":["�׷�","����ڽ��콫����ִ���Ƚ��£��׷�����ð��ע�������·�����ǿ���ҷ��������ð��"],"ziwaixian":["����","���������߷��������������ر�������������ڻ��⣬����Ϳ��SPF��8-12֮��ķ�ɹ����Ʒ��"],"xiche":["����","����ϴ����δ��24Сʱ�����꣬����ڴ��ڼ�ϴ������ˮ��·�ϵ���ˮ���ܻ��ٴ�Ū�����İ�����"],"yundong":["�ϲ���","�н�ˮ���ҷ�����ǿ���������ڻ��ڽ��и��ֽ��������˶�������ֻ����˶�����ע�Ᵽů��"],"daisan":["��ɡ","�н�ˮ���������ɡ�������ϲ���������������ܴ���Ȼ�������ܰ�Ϳ��֣��ڶ�ʱ�������������ɡ��"]}},"weather":[{"date":"2019-10-16","info":{"dawn":["7","С��","13","����","3-5��","18:01"],"day":["7","С��","14","����","3-5��","06:32","���żǵô�ɡ�����߼�ʻ���÷���׼��"],"night":["0","��","10","����","΢��","18:00","���żǵô�ɡ�����߼�ʻ���÷���׼��"]},"week":"��","nongli":"����ʮ��"},{"date":"2019-10-17","info":{"dawn":["0","��","10","����","΢��","18:00"],"day":["1","����","19","����","΢��","06:33"],"night":["1","����","10","����","΢��","17:59"]},"week":"��","nongli":"����ʮ��"},{"date":"2019-10-18","info":{"dawn":["1","����","10","����","΢��","17:59"],"day":["1","����","23","����","΢��","06:34"],"night":["1","����","12","���Ϸ�","΢��","17:58"]},"week":"��","nongli":"���¶�ʮ"},{"date":"2019-10-19","info":{"dawn":["1","����","12","���Ϸ�","΢��","17:58"],"day":["1","����","24","���Ϸ�","΢��","06:34"],"night":["1","����","12","����","΢��","17:57"]},"week":"��","nongli":"����إһ"},{"date":"2019-10-20","info":{"dawn":["1","����","12","����","΢��","17:57"],"day":["1","����","25","����","΢��","06:35"],"night":["1","����","14","����","΢��","17:56"]},"week":"��","nongli":"����إ��"}],"f3h":{"temperature":[{"jg":"20191016200000","jb":"12"},{"jg":"20191016230000","jb":"13"},{"jg":"20191017020000","jb":"12"},{"jg":"20191017050000","jb":"11"},{"jg":"20191017080000","jb":"12"},{"jg":"20191017110000","jb":"17"},{"jg":"20191017140000","jb":"19"},{"jg":"20191017170000","jb":"19"},{"jg":"20191017200000","jb":"15"}],"precipitation":[{"jg":"20191016200000","jf":"0"},{"jg":"20191016230000","jf":"0"},{"jg":"20191017020000","jf":"0"},{"jg":"20191017050000","jf":"0"},{"jg":"20191017080000","jf":"0"},{"jg":"20191017110000","jf":"0"},{"jg":"20191017140000","jf":"0"},{"jg":"20191017170000","jf":"0"},{"jg":"20191017200000","jf":"0"}]},"pm25":{"pm25":{"level":"1","quality":"��","des":"�����ܰ�������ź������ʿ����ɡ�","curPm":"26","pm25":"18","pm10":"23","pub_time":"1571223600","city_code":"101200801"},"cityName":"����","key":"����","dateTime":"2019��10��16��19ʱ"},"isForeign":"0","partner":{"title_word":"ȫ��","show_url":"tianqi.so.com","base_url":"http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101200801&q=&ts=1571229846&t=a7e6a714f3b42037ac2c1fea7fe8229"}}
	*/ 
	
	private DataBen data;

	public void setData(DataBen data){
		this.data = data;
	}
	
	public DataBen getData(){
		return data;
	}

	public static class DataBen {
	
		/** 
		* realtime : {"city_code":"101200801","city_name":"����","date":"2019-10-16","time":"20:00:00","week":"3","moon":"����ʮ��","dataUptime":"1571228547","weather":{"temperature":"12","humidity":"90","info":"����","img":"01"},"wind":{"direct":"����","power":"3��"}}
		* life : {"date":"2019-10-16","info":{"kongtiao":["���ٿ���","�����е������ʣ�һ�㲻��Ҫ�����յ���"],"guomin":["�׷�","�����������շ��������н�ˮ���׹�����ȺӦ������������������ô����³��㣬Ԥ����ð���������Ĺ�����"],"shushidu":["������","������н��꣬���ǻ�е���Щ���⣬���󲿷�����ȫ���Խ��ܡ�"],"chuanyi":["����","�����ź����׼�ë�µȷ�װ���������������Ŵ��¡������׼���ë����"],"diaoyu":["����","��ǰһ���нϴ��£����ʺϴ�����"],"ganmao":["�׷�","����ڽ��콫����ִ���Ƚ��£��׷�����ð��ע�������·�����ǿ���ҷ��������ð��"],"ziwaixian":["����","���������߷��������������ر�������������ڻ��⣬����Ϳ��SPF��8-12֮��ķ�ɹ����Ʒ��"],"xiche":["����","����ϴ����δ��24Сʱ�����꣬����ڴ��ڼ�ϴ������ˮ��·�ϵ���ˮ���ܻ��ٴ�Ū�����İ�����"],"yundong":["�ϲ���","�н�ˮ���ҷ�����ǿ���������ڻ��ڽ��и��ֽ��������˶�������ֻ����˶�����ע�Ᵽů��"],"daisan":["��ɡ","�н�ˮ���������ɡ�������ϲ���������������ܴ���Ȼ�������ܰ�Ϳ��֣��ڶ�ʱ�������������ɡ��"]}}
		* weather : [{"date":"2019-10-16","info":{"dawn":["7","С��","13","����","3-5��","18:01"],"day":["7","С��","14","����","3-5��","06:32","���żǵô�ɡ�����߼�ʻ���÷���׼��"],"night":["0","��","10","����","΢��","18:00","���żǵô�ɡ�����߼�ʻ���÷���׼��"]},"week":"��","nongli":"����ʮ��"},{"date":"2019-10-17","info":{"dawn":["0","��","10","����","΢��","18:00"],"day":["1","����","19","����","΢��","06:33"],"night":["1","����","10","����","΢��","17:59"]},"week":"��","nongli":"����ʮ��"},{"date":"2019-10-18","info":{"dawn":["1","����","10","����","΢��","17:59"],"day":["1","����","23","����","΢��","06:34"],"night":["1","����","12","���Ϸ�","΢��","17:58"]},"week":"��","nongli":"���¶�ʮ"},{"date":"2019-10-19","info":{"dawn":["1","����","12","���Ϸ�","΢��","17:58"],"day":["1","����","24","���Ϸ�","΢��","06:34"],"night":["1","����","12","����","΢��","17:57"]},"week":"��","nongli":"����إһ"},{"date":"2019-10-20","info":{"dawn":["1","����","12","����","΢��","17:57"],"day":["1","����","25","����","΢��","06:35"],"night":["1","����","14","����","΢��","17:56"]},"week":"��","nongli":"����إ��"}]
		* f3h : {"temperature":[{"jg":"20191016200000","jb":"12"},{"jg":"20191016230000","jb":"13"},{"jg":"20191017020000","jb":"12"},{"jg":"20191017050000","jb":"11"},{"jg":"20191017080000","jb":"12"},{"jg":"20191017110000","jb":"17"},{"jg":"20191017140000","jb":"19"},{"jg":"20191017170000","jb":"19"},{"jg":"20191017200000","jb":"15"}],"precipitation":[{"jg":"20191016200000","jf":"0"},{"jg":"20191016230000","jf":"0"},{"jg":"20191017020000","jf":"0"},{"jg":"20191017050000","jf":"0"},{"jg":"20191017080000","jf":"0"},{"jg":"20191017110000","jf":"0"},{"jg":"20191017140000","jf":"0"},{"jg":"20191017170000","jf":"0"},{"jg":"20191017200000","jf":"0"}]}
		* pm25 : {"pm25":{"level":"1","quality":"��","des":"�����ܰ�������ź������ʿ����ɡ�","curPm":"26","pm25":"18","pm10":"23","pub_time":"1571223600","city_code":"101200801"},"cityName":"����","key":"����","dateTime":"2019��10��16��19ʱ"}
		* isForeign : 0
		* partner : {"title_word":"ȫ��","show_url":"tianqi.so.com","base_url":"http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101200801&q=&ts=1571229846&t=a7e6a714f3b42037ac2c1fea7fe8229"}
		*/ 
	
		private RealtimeBen realtime;
	
		private LifeBen life;
	
		private F3hBen f3h;
	
		private Pm25BenX pm25;
	
		private String isForeign;
	
		private PartnerBen partner;
	
		private java.util.List<WeatherBenX> weather;
	
		public void setRealtime(RealtimeBen realtime){
			this.realtime = realtime;
		}
	
		public RealtimeBen getRealtime(){
			return realtime;
		}
	
		public void setLife(LifeBen life){
			this.life = life;
		}
	
		public LifeBen getLife(){
			return life;
		}
	
		public void setF3h(F3hBen f3h){
			this.f3h = f3h;
		}
	
		public F3hBen getF3h(){
			return f3h;
		}
	
		public void setPm25(Pm25BenX pm25){
			this.pm25 = pm25;
		}
	
		public Pm25BenX getPm25(){
			return pm25;
		}
	
		public void setIsForeign(String isForeign){
			this.isForeign = isForeign;
		}
	
		public String getIsForeign(){
			return isForeign;
		}
	
		public void setPartner(PartnerBen partner){
			this.partner = partner;
		}
	
		public PartnerBen getPartner(){
			return partner;
		}
	
		public void setWeather(java.util.List<WeatherBenX> weather){
			this.weather = weather;
		}
	
		public java.util.List<WeatherBenX> getWeather(){
			return weather;
		}
	
	}
	
	public static class RealtimeBen {
	
		/** 
		* city_code : 101200801
		* city_name : ����
		* date : 2019-10-16
		* time : 20:00:00
		* week : 3
		* moon : ����ʮ��
		* dataUptime : 1571228547
		* weather : {"temperature":"12","humidity":"90","info":"����","img":"01"}
		* wind : {"direct":"����","power":"3��"}
		*/ 
	
		private String city_code;
	
		private String city_name;
	
		private String date;
	
		private String time;
	
		private String week;
	
		private String moon;
	
		private String dataUptime;
	
		private WeatherBen weather;
	
		private WindBen wind;
	
		public void setCity_code(String city_code){
			this.city_code = city_code;
		}
	
		public String getCity_code(){
			return city_code;
		}
	
		public void setCity_name(String city_name){
			this.city_name = city_name;
		}
	
		public String getCity_name(){
			return city_name;
		}
	
		public void setDate(String date){
			this.date = date;
		}
	
		public String getDate(){
			return date;
		}
	
		public void setTime(String time){
			this.time = time;
		}
	
		public String getTime(){
			return time;
		}
	
		public void setWeek(String week){
			this.week = week;
		}
	
		public String getWeek(){
			return week;
		}
	
		public void setMoon(String moon){
			this.moon = moon;
		}
	
		public String getMoon(){
			return moon;
		}
	
		public void setDataUptime(String dataUptime){
			this.dataUptime = dataUptime;
		}
	
		public String getDataUptime(){
			return dataUptime;
		}
	
		public void setWeather(WeatherBen weather){
			this.weather = weather;
		}
	
		public WeatherBen getWeather(){
			return weather;
		}
	
		public void setWind(WindBen wind){
			this.wind = wind;
		}
	
		public WindBen getWind(){
			return wind;
		}
	
	}
	
	public static class WeatherBen {
	
		/** 
		* temperature : 12
		* humidity : 90
		* info : ����
		* img : 01
		*/ 
	
		private String temperature;
	
		private String humidity;
	
		private String info;
	
		private String img;
	
		public void setTemperature(String temperature){
			this.temperature = temperature;
		}
	
		public String getTemperature(){
			return temperature;
		}
	
		public void setHumidity(String humidity){
			this.humidity = humidity;
		}
	
		public String getHumidity(){
			return humidity;
		}
	
		public void setInfo(String info){
			this.info = info;
		}
	
		public String getInfo(){
			return info;
		}
	
		public void setImg(String img){
			this.img = img;
		}
	
		public String getImg(){
			return img;
		}
	
	}
	
	public static class WindBen {
	
		/** 
		* direct : ����
		* power : 3��
		*/ 
	
		private String direct;
	
		private String power;
	
		public void setDirect(String direct){
			this.direct = direct;
		}
	
		public String getDirect(){
			return direct;
		}
	
		public void setPower(String power){
			this.power = power;
		}
	
		public String getPower(){
			return power;
		}
	
	}
	
	public static class LifeBen {
	
		/** 
		* date : 2019-10-16
		* info : {"kongtiao":["���ٿ���","�����е������ʣ�һ�㲻��Ҫ�����յ���"],"guomin":["�׷�","�����������շ��������н�ˮ���׹�����ȺӦ������������������ô����³��㣬Ԥ����ð���������Ĺ�����"],"shushidu":["������","������н��꣬���ǻ�е���Щ���⣬���󲿷�����ȫ���Խ��ܡ�"],"chuanyi":["����","�����ź����׼�ë�µȷ�װ���������������Ŵ��¡������׼���ë����"],"diaoyu":["����","��ǰһ���нϴ��£����ʺϴ�����"],"ganmao":["�׷�","����ڽ��콫����ִ���Ƚ��£��׷�����ð��ע�������·�����ǿ���ҷ��������ð��"],"ziwaixian":["����","���������߷��������������ر�������������ڻ��⣬����Ϳ��SPF��8-12֮��ķ�ɹ����Ʒ��"],"xiche":["����","����ϴ����δ��24Сʱ�����꣬����ڴ��ڼ�ϴ������ˮ��·�ϵ���ˮ���ܻ��ٴ�Ū�����İ�����"],"yundong":["�ϲ���","�н�ˮ���ҷ�����ǿ���������ڻ��ڽ��и��ֽ��������˶�������ֻ����˶�����ע�Ᵽů��"],"daisan":["��ɡ","�н�ˮ���������ɡ�������ϲ���������������ܴ���Ȼ�������ܰ�Ϳ��֣��ڶ�ʱ�������������ɡ��"]}
		*/ 
	
		private String date;
	
		private InfoBen info;
	
		public void setDate(String date){
			this.date = date;
		}
	
		public String getDate(){
			return date;
		}
	
		public void setInfo(InfoBen info){
			this.info = info;
		}
	
		public InfoBen getInfo(){
			return info;
		}
	
	}
	
	public static class InfoBen {
		private java.util.List<String> kongtiao;
	
		private java.util.List<String> guomin;
	
		private java.util.List<String> shushidu;
	
		private java.util.List<String> chuanyi;
	
		private java.util.List<String> diaoyu;
	
		private java.util.List<String> ganmao;
	
		private java.util.List<String> ziwaixian;
	
		private java.util.List<String> xiche;
	
		private java.util.List<String> yundong;
	
		private java.util.List<String> daisan;
	
		public void setKongtiao(java.util.List<String> kongtiao){
			this.kongtiao = kongtiao;
		}
	
		public java.util.List<String> getKongtiao(){
			return kongtiao;
		}
	
		public void setGuomin(java.util.List<String> guomin){
			this.guomin = guomin;
		}
	
		public java.util.List<String> getGuomin(){
			return guomin;
		}
	
		public void setShushidu(java.util.List<String> shushidu){
			this.shushidu = shushidu;
		}
	
		public java.util.List<String> getShushidu(){
			return shushidu;
		}
	
		public void setChuanyi(java.util.List<String> chuanyi){
			this.chuanyi = chuanyi;
		}
	
		public java.util.List<String> getChuanyi(){
			return chuanyi;
		}
	
		public void setDiaoyu(java.util.List<String> diaoyu){
			this.diaoyu = diaoyu;
		}
	
		public java.util.List<String> getDiaoyu(){
			return diaoyu;
		}
	
		public void setGanmao(java.util.List<String> ganmao){
			this.ganmao = ganmao;
		}
	
		public java.util.List<String> getGanmao(){
			return ganmao;
		}
	
		public void setZiwaixian(java.util.List<String> ziwaixian){
			this.ziwaixian = ziwaixian;
		}
	
		public java.util.List<String> getZiwaixian(){
			return ziwaixian;
		}
	
		public void setXiche(java.util.List<String> xiche){
			this.xiche = xiche;
		}
	
		public java.util.List<String> getXiche(){
			return xiche;
		}
	
		public void setYundong(java.util.List<String> yundong){
			this.yundong = yundong;
		}
	
		public java.util.List<String> getYundong(){
			return yundong;
		}
	
		public void setDaisan(java.util.List<String> daisan){
			this.daisan = daisan;
		}
	
		public java.util.List<String> getDaisan(){
			return daisan;
		}
	
	}
	
	public static class F3hBen {
		private java.util.List<TemperatureBen> temperature;
	
		private java.util.List<PrecipitationBen> precipitation;
	
		public void setTemperature(java.util.List<TemperatureBen> temperature){
			this.temperature = temperature;
		}
	
		public java.util.List<TemperatureBen> getTemperature(){
			return temperature;
		}
	
		public void setPrecipitation(java.util.List<PrecipitationBen> precipitation){
			this.precipitation = precipitation;
		}
	
		public java.util.List<PrecipitationBen> getPrecipitation(){
			return precipitation;
		}
	
	}
	
	public static class TemperatureBen {
	
		/** 
		* jg : 20191016200000
		* jb : 12
		*/ 
	
		private String jg;
	
		private String jb;
	
		public void setJg(String jg){
			this.jg = jg;
		}
	
		public String getJg(){
			return jg;
		}
	
		public void setJb(String jb){
			this.jb = jb;
		}
	
		public String getJb(){
			return jb;
		}
	
	}
	
	public static class PrecipitationBen {
	
		/** 
		* jg : 20191016200000
		* jf : 0
		*/ 
	
		private String jg;
	
		private String jf;
	
		public void setJg(String jg){
			this.jg = jg;
		}
	
		public String getJg(){
			return jg;
		}
	
		public void setJf(String jf){
			this.jf = jf;
		}
	
		public String getJf(){
			return jf;
		}
	
	}
	
	public static class Pm25BenX {
	
		/** 
		* pm25 : {"level":"1","quality":"��","des":"�����ܰ�������ź������ʿ����ɡ�","curPm":"26","pm25":"18","pm10":"23","pub_time":"1571223600","city_code":"101200801"}
		* cityName : ����
		* key : ����
		* dateTime : 2019��10��16��19ʱ
		*/ 
	
		private Pm25Ben pm25;
	
		private String cityName;
	
		private String key;
	
		private String dateTime;
	
		public void setPm25(Pm25Ben pm25){
			this.pm25 = pm25;
		}
	
		public Pm25Ben getPm25(){
			return pm25;
		}
	
		public void setCityName(String cityName){
			this.cityName = cityName;
		}
	
		public String getCityName(){
			return cityName;
		}
	
		public void setKey(String key){
			this.key = key;
		}
	
		public String getKey(){
			return key;
		}
	
		public void setDateTime(String dateTime){
			this.dateTime = dateTime;
		}
	
		public String getDateTime(){
			return dateTime;
		}
	
	}
	
	public static class Pm25Ben {
	
		/** 
		* level : 1
		* quality : ��
		* des : �����ܰ�������ź������ʿ����ɡ�
		* curPm : 26
		* pm25 : 18
		* pm10 : 23
		* pub_time : 1571223600
		* city_code : 101200801
		*/ 
	
		private String level;
	
		private String quality;
	
		private String des;
	
		private String curPm;
	
		private String pm25;
	
		private String pm10;
	
		private String pub_time;
	
		private String city_code;
	
		public void setLevel(String level){
			this.level = level;
		}
	
		public String getLevel(){
			return level;
		}
	
		public void setQuality(String quality){
			this.quality = quality;
		}
	
		public String getQuality(){
			return quality;
		}
	
		public void setDes(String des){
			this.des = des;
		}
	
		public String getDes(){
			return des;
		}
	
		public void setCurPm(String curPm){
			this.curPm = curPm;
		}
	
		public String getCurPm(){
			return curPm;
		}
	
		public void setPm25(String pm25){
			this.pm25 = pm25;
		}
	
		public String getPm25(){
			return pm25;
		}
	
		public void setPm10(String pm10){
			this.pm10 = pm10;
		}
	
		public String getPm10(){
			return pm10;
		}
	
		public void setPub_time(String pub_time){
			this.pub_time = pub_time;
		}
	
		public String getPub_time(){
			return pub_time;
		}
	
		public void setCity_code(String city_code){
			this.city_code = city_code;
		}
	
		public String getCity_code(){
			return city_code;
		}
	
	}
	
	public static class PartnerBen {
	
		/** 
		* title_word : ȫ��
		* show_url : tianqi.so.com
		* base_url : http://www.so.com/link?url=http%3A%2F%2Ftianqi.so.com%2Fweather%2F101200801&q=&ts=1571229846&t=a7e6a714f3b42037ac2c1fea7fe8229
		*/ 
	
		private String title_word;
	
		private String show_url;
	
		private String base_url;
	
		public void setTitle_word(String title_word){
			this.title_word = title_word;
		}
	
		public String getTitle_word(){
			return title_word;
		}
	
		public void setShow_url(String show_url){
			this.show_url = show_url;
		}
	
		public String getShow_url(){
			return show_url;
		}
	
		public void setBase_url(String base_url){
			this.base_url = base_url;
		}
	
		public String getBase_url(){
			return base_url;
		}
	
	}
	
	public static class WeatherBenX {
	
		/** 
		* date : 2019-10-16
		* info : {"dawn":["7","С��","13","����","3-5��","18:01"],"day":["7","С��","14","����","3-5��","06:32","���żǵô�ɡ�����߼�ʻ���÷���׼��"],"night":["0","��","10","����","΢��","18:00","���żǵô�ɡ�����߼�ʻ���÷���׼��"]}
		* week : ��
		* nongli : ����ʮ��
		*/ 
	
		private String date;
	
		private InfoBenX info;
	
		private String week;
	
		private String nongli;
	
		public void setDate(String date){
			this.date = date;
		}
	
		public String getDate(){
			return date;
		}
	
		public void setInfo(InfoBenX info){
			this.info = info;
		}
	
		public InfoBenX getInfo(){
			return info;
		}
	
		public void setWeek(String week){
			this.week = week;
		}
	
		public String getWeek(){
			return week;
		}
	
		public void setNongli(String nongli){
			this.nongli = nongli;
		}
	
		public String getNongli(){
			return nongli;
		}
	
	}
	
	public static class InfoBenX {
		private java.util.List<String> dawn;
	
		private java.util.List<String> day;
	
		private java.util.List<String> night;
	
		public void setDawn(java.util.List<String> dawn){
			this.dawn = dawn;
		}
	
		public java.util.List<String> getDawn(){
			return dawn;
		}
	
		public void setDay(java.util.List<String> day){
			this.day = day;
		}
	
		public java.util.List<String> getDay(){
			return day;
		}
	
		public void setNight(java.util.List<String> night){
			this.night = night;
		}
	
		public java.util.List<String> getNight(){
			return night;
		}
	
	}

}
