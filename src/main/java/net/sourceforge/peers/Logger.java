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


public class Logger {
	private org.apache.log4j.Logger log4j;

	public Logger(String loggerName) {
		log4j = org.apache.log4j.Logger.getLogger(loggerName);
	}

	public final org.apache.log4j.Logger getLogger() {
		return log4j;
	}

	public final void setLogger(org.apache.log4j.Logger log4j) {
		this.log4j = log4j;
	}

	public void debug(String message) {
		log4j.debug(message);
	}

	public void info(String message) {
		log4j.info(message);
	}

	public void error(String message) {
		log4j.error(message);
	}

	public void error(String message, Exception exception) {
		log4j.error(message, exception);
	}

	public void traceNetwork(String message, String direction) {
		log4j.info(direction + "[" + Thread.currentThread().getName() + "]" + message);
	}
}
