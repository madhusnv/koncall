package p001o;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class dr4 implements f07 {

    /* renamed from: a */
    public final long f20430a;

    /* renamed from: b */
    public final long f20431b;

    /* renamed from: c */
    public final long f20432c;

    /* renamed from: d */
    public final boolean f20433d;

    /* renamed from: e */
    public final long f20434e;

    /* renamed from: f */
    public final long f20435f;

    /* renamed from: g */
    public final long f20436g;

    /* renamed from: h */
    public final long f20437h;

    /* renamed from: i */
    public final hqi f20438i;

    /* renamed from: j */
    public final fgf f20439j;

    /* renamed from: k */
    public final Uri f20440k;

    /* renamed from: l */
    public final ymd f20441l;

    /* renamed from: m */
    public final List f20442m;

    public dr4(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ymd ymdVar, hqi hqiVar, fgf fgfVar, Uri uri, List list) {
        this.f20430a = j;
        this.f20431b = j2;
        this.f20432c = j3;
        this.f20433d = z;
        this.f20434e = j4;
        this.f20435f = j5;
        this.f20436g = j6;
        this.f20437h = j7;
        this.f20441l = ymdVar;
        this.f20438i = hqiVar;
        this.f20440k = uri;
        this.f20439j = fgfVar;
        this.f20442m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList m23689c(List list, LinkedList linkedList) {
        StreamKey streamKey = (StreamKey) linkedList.poll();
        int i = streamKey.f7901a;
        ArrayList arrayList = new ArrayList();
        do {
            int i2 = streamKey.f7902b;
            tv tvVar = (tv) list.get(i2);
            List list2 = tvVar.f47942c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((tle) list2.get(streamKey.f7903c));
                streamKey = (StreamKey) linkedList.poll();
                if (streamKey.f7901a != i) {
                    break;
                }
            } while (streamKey.f7902b == i2);
            arrayList.add(new tv(tvVar.f47940a, tvVar.f47941b, arrayList2, tvVar.f47943d, tvVar.f47944e, tvVar.f47945f));
        } while (streamKey.f7901a == i);
        linkedList.addFirst(streamKey);
        return arrayList;
    }

    @Override // p001o.f07
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dr4 mo22238a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= m23692e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f7901a != i) {
                long jM23693f = m23693f(i);
                if (jM23693f != -9223372036854775807L) {
                    j += jM23693f;
                }
            } else {
                g3d g3dVarM23691d = m23691d(i);
                arrayList.add(new g3d(g3dVarM23691d.f24526a, g3dVarM23691d.f24527b - j, m23689c(g3dVarM23691d.f24528c, linkedList), g3dVarM23691d.f24529d));
            }
            i++;
        }
        long j2 = this.f20431b;
        return new dr4(this.f20430a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f20432c, this.f20433d, this.f20434e, this.f20435f, this.f20436g, this.f20437h, this.f20441l, this.f20438i, this.f20439j, this.f20440k, arrayList);
    }

    /* renamed from: d */
    public final g3d m23691d(int i) {
        return (g3d) this.f20442m.get(i);
    }

    /* renamed from: e */
    public final int m23692e() {
        return this.f20442m.size();
    }

    /* renamed from: f */
    public final long m23693f(int i) {
        long j;
        long j2;
        if (i == this.f20442m.size() - 1) {
            j = this.f20431b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((g3d) this.f20442m.get(i)).f24527b;
        } else {
            j = ((g3d) this.f20442m.get(i + 1)).f24527b;
            j2 = ((g3d) this.f20442m.get(i)).f24527b;
        }
        return j - j2;
    }

    /* renamed from: g */
    public final long m23694g(int i) {
        return sqi.O0(m23693f(i));
    }
}
