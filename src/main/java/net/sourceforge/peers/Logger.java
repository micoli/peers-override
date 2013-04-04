/*
	This file is part of Peers, a java SIP softphone.

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.

	Copyright 2007, 2008, 2009, 2010 Yohann Martineau
 */

package net.sourceforge.peers;

import org.slf4j.LoggerFactory;

public class Logger {
	public static enum Level {
		OFF, INFO, ERROR, DEBUG
	}

	Level level = Level.INFO;

	private org.slf4j.Logger logger;

	public Logger(String loggerName) {
		logger = LoggerFactory.getLogger(loggerName);
	}

	public final org.slf4j.Logger getLogger() {
		return logger;
	}

	public final void setLogger(org.slf4j.Logger logger) {
		this.logger = logger;
	}

	public final void setLevel(Level level) {
		this.level = level;
	}

	public void debug(String message) {
		switch (level) {
		case OFF:
			break;
		case ERROR:
		case INFO:
		case DEBUG:
			logger.debug(message);
			break;
		}
	}

	public void info(String message) {
		switch (level) {
		case OFF:
			break;
		case ERROR:
		case INFO:
		case DEBUG:
			logger.debug(message);
			break;
		}
	}

	public void error(String message) {
		switch (level) {
		case OFF:
			break;
		case ERROR:
		case INFO:
		case DEBUG:
			logger.debug(message);
			break;
		}
	}

	public void error(String message, Exception exception) {
		switch (level) {
		case OFF:
			break;
		case ERROR:
		case INFO:
		case DEBUG:
			logger.error(message, exception);
			break;
		}
	}

	public void traceNetwork(String message, String direction) {
		info(direction + "[" + Thread.currentThread().getName() + "]" + message);
	}
}