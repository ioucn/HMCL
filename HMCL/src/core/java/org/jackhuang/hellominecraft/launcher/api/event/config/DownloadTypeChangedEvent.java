/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2013  huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hellominecraft.launcher.api.event.config;

import org.jackhuang.hellominecraft.api.SimpleEvent;
import org.jackhuang.hellominecraft.launcher.core.download.DownloadType;

/**
 * This event gets fired when the download type changed.
 * <br>
 * This event is fired on the {@link org.jackhuang.hellominecraft.api.HMCAPI#EVENT_BUS}
 * @param source {@link org.jackhuang.hellominecraft.launcher.setting.Config}
 * @param DownloadType the new downlaod type
 * @author huangyuhui
 */
public class DownloadTypeChangedEvent extends SimpleEvent<DownloadType> {
    
    public DownloadTypeChangedEvent(Object source, DownloadType value) {
        super(source, value);
    }
    
}
