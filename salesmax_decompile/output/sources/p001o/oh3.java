package p001o;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* loaded from: classes5.dex */
public class oh3 {

    /* renamed from: c */
    public static oh3 f38347c = m42238a(Arrays.asList(-957596, -686759, -416706, -1784274, -9977996, -10902850, -14642227, -5414233, -8366207));

    /* renamed from: d */
    public static oh3 f38348d = m42238a(Arrays.asList(-1739917, -1023342, -4560696, -6982195, -8812853, -10177034, -11549705, -11677471, -11684180, -8271996, -5319295, -30107, -2825897, -10929, -18611, -6190977, -7297874));

    /* renamed from: a */
    public final List f38349a;

    /* renamed from: b */
    public final Random f38350b = new Random(System.currentTimeMillis());

    public oh3(List list) {
        this.f38349a = list;
    }

    /* renamed from: a */
    public static oh3 m42238a(List list) {
        return new oh3(list);
    }

    /* renamed from: b */
    public int m42239b(Object obj) {
        return ((Integer) this.f38349a.get(Math.abs(obj.hashCode()) % this.f38349a.size())).intValue();
    }
}
