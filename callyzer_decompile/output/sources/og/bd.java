package og;

import a9.C0073l;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l0.RunnableC4307g;
import ng.C5070u;
import qe.C6194e;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class bd {

    /* renamed from: a */
    public static final /* synthetic */ int f26341a = 0;

    /* renamed from: a */
    public static void m10555a(String str, C0073l c0073l, C8989c c8989c, C5070u c5070u) {
        AtomicInteger atomicInteger = FFmpegKitConfig.f5946a;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z6 = false;
        boolean z10 = false;
        while (i10 < str.length()) {
            Character chValueOf = i10 > 0 ? Character.valueOf(str.charAt(i10 - 1)) : null;
            char cCharAt = str.charAt(i10);
            if (cCharAt == ' ') {
                if (z6 || z10) {
                    sb2.append(cCharAt);
                } else if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2 = new StringBuilder();
                }
            } else if (cCharAt != '\'' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                if (cCharAt != '\"' || (chValueOf != null && chValueOf.charValue() == '\\')) {
                    sb2.append(cCharAt);
                } else if (z10) {
                    z10 = false;
                } else if (z6) {
                    sb2.append(cCharAt);
                } else {
                    z10 = true;
                }
            } else if (z6) {
                z6 = false;
            } else if (z10) {
                sb2.append(cCharAt);
            } else {
                z6 = true;
            }
            i10++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        FFmpegKitConfig.f5952g.submit(new RunnableC4307g(new C6194e((String[]) arrayList.toArray(new String[0]), c0073l, c8989c, c5070u, FFmpegKitConfig.f5955j)));
    }
}
