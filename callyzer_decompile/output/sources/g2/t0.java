package g2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a */
    public static final WeakHashMap f12727a = new WeakHashMap();

    /* renamed from: a */
    public static String m6309a(int i10, int i11) {
        int i12 = (i11 & 1) == 0 ? 2 : 1;
        String str = i12 + ".40.false." + Locale.getDefault().toLanguageTag();
        WeakHashMap weakHashMap = f12727a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i12);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i10));
    }
}
