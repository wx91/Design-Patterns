package com.wangx.CommandHandlerDemo;

public class LS extends AbstractLS {

	@Override
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

	@Override
	protected String echo(CommandVO vo) {
		return FileManager.ls(vo.getCommandName());
	}

}
