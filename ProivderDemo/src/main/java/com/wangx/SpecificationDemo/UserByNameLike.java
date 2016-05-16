package com.wangx.SpecificationDemo;

public class UserByNameLike extends CompositeSpecification {
	//like的标记
	private final static String LIKE_FLAG = "%";
	//基准的like字符串
	private String likeStr;
	//构造函数传递基准姓名
	public UserByNameLike(String likeStr) {
		super();
		this.likeStr = likeStr;
	}
	//检查用户是否满足条件
	public boolean isSatisfiedBy(User user) {
		boolean result = false;
		String name = user.getName();
		//替换掉%后的干净字符串
		String str = likeStr.replace("%", "");
		//以名字开头，如"国庆%"
		if(likeStr.endsWith(LIKE_FLAG)&&!likeStr.startsWith(LIKE_FLAG)){//类似于'国庆%'
			result = name.startsWith(str);
		}else if(likeStr.startsWith(LIKE_FLAG)&&!likeStr.endsWith(LIKE_FLAG)){//类似于'%国庆'
			result = name.endsWith(str);
		}else{
			result = name.contains(str);//类似于'%国庆%'
		}
		return result;
	}

}
