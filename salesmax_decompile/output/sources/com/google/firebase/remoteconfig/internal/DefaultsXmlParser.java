package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class DefaultsXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final String XML_TAG_VALUE = "value";

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070 A[Catch: IOException | XmlPullParserException -> 0x0079, TryCatch #0 {IOException | XmlPullParserException -> 0x0079, blocks: (B:3:0x0005, B:6:0x000c, B:11:0x001e, B:41:0x0074, B:14:0x0026, B:18:0x0036, B:24:0x0042, B:39:0x006b, B:40:0x0070, B:29:0x0051, B:32:0x005b), top: B:45:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> getDefaultsFromXml(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Resources resources;
        char c;
        HashMap map = new HashMap();
        try {
            resources = context.getResources();
        } catch (IOException | XmlPullParserException unused) {
        }
        if (resources == null) {
            return map;
        }
        XmlResourceParser xml = resources.getXml(i);
        String name = null;
        String text = null;
        String text2 = null;
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                name = xml.getName();
            } else if (eventType == 3) {
                if (xml.getName().equals(XML_TAG_ENTRY)) {
                    if (text != null && text2 != null) {
                        map.put(text, text2);
                    }
                    text = null;
                    text2 = null;
                }
                name = null;
            } else if (eventType == 4 && name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != 106079) {
                    c = (iHashCode == 111972721 && name.equals("value")) ? (char) 1 : (char) 65535;
                    if (c != 0) {
                        text = xml.getText();
                    } else if (c == 1) {
                        text2 = xml.getText();
                    }
                } else {
                    if (name.equals("key")) {
                        c = 0;
                    }
                    if (c != 0) {
                    }
                }
            }
        }
        return map;
    }
}
