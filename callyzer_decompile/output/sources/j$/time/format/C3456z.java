package j$.time.format;

import j$.time.AbstractC3400b;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j$.time.format.z */
/* loaded from: classes2.dex */
public class C3456z {

    /* renamed from: a */
    public static final ConcurrentMap f18216a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b */
    public static final C3454x f18217b = new C3454x();

    /* renamed from: c */
    public static final C3456z f18218c = new C3456z();

    /* renamed from: c */
    public String mo7951c(TemporalField temporalField, long j6, TextStyle textStyle, Locale locale) {
        Object objM7994a = m7994a(temporalField, locale);
        if (objM7994a instanceof C3455y) {
            return ((C3455y) objM7994a).m7993a(j6, textStyle);
        }
        return null;
    }

    /* renamed from: b */
    public String mo7950b(Chronology chronology, TemporalField temporalField, long j6, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return mo7951c(temporalField, j6, textStyle, locale);
        }
        return null;
    }

    /* renamed from: e */
    public Iterator mo7953e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objM7994a = m7994a(temporalField, locale);
        if (!(objM7994a instanceof C3455y) || (list = (List) ((HashMap) ((C3455y) objM7994a).f18215b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: d */
    public Iterator mo7952d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return mo7953e(temporalField, textStyle, locale);
        }
        return null;
    }

    /* renamed from: a */
    public static Object m7994a(TemporalField temporalField, Locale locale) {
        Object c3455y;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj = ((ConcurrentHashMap) f18216a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i10 = 0; i10 < eras.length; i10++) {
                if (!eras[i10].isEmpty()) {
                    long j6 = i10;
                    map2.put(Long.valueOf(j6), eras[i10]);
                    Long lValueOf = Long.valueOf(j6);
                    String str = eras[i10];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            c3455y = new C3455y(map);
        } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j10 = 1; j10 <= length; j10++) {
                String strM7883b = AbstractC3400b.m7883b(j10, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j10), strM7883b);
                linkedHashMap2.put(Long.valueOf(j10), strM7883b.substring(0, Character.charCount(strM7883b.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j10), AbstractC3400b.m7883b(j10, "LLL", locale));
            }
            if (length > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                map.put(TextStyle.FULL, linkedHashMap);
                map.put(TextStyle.NARROW, linkedHashMap2);
                map.put(TextStyle.SHORT, linkedHashMap3);
            }
            c3455y = new C3455y(map);
        } else if (temporalField == ChronoField.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z6 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j11 = 1; j11 <= length2; j11++) {
                String strM7882a = AbstractC3400b.m7882a(j11, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j11), strM7882a);
                Long lValueOf2 = Long.valueOf(j11);
                if (!z6) {
                    strSubstring = strM7882a.substring(0, Character.charCount(strM7882a.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strM7882a.codePointBefore(strM7882a.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j11), AbstractC3400b.m7882a(j11, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                map.put(TextStyle.FULL, linkedHashMap4);
                map.put(TextStyle.NARROW, linkedHashMap5);
                map.put(TextStyle.SHORT, linkedHashMap6);
            }
            c3455y = new C3455y(map);
        } else if (temporalField == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i11 = 0; i11 < amPmStrings.length; i11++) {
                if (!amPmStrings[i11].isEmpty()) {
                    long j12 = i11;
                    map4.put(Long.valueOf(j12), amPmStrings[i11]);
                    Long lValueOf3 = Long.valueOf(j12);
                    String str2 = amPmStrings[i11];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.SHORT, map4);
                map.put(TextStyle.NARROW, map5);
            }
            c3455y = new C3455y(map);
        } else {
            c3455y = "";
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f18216a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, c3455y);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
