package pg;

import a9.C0073l;
import com.sun.mail.imap.IMAPStore;
import h9.C2870a;
import j$.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.bb;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ox.C5770a;
import ox.EnumC5772c;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.j */
/* loaded from: classes.dex */
public abstract class AbstractC5929j {
    /* renamed from: a */
    public static final C7126c m11702a(long j6) {
        DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
        long j10 = IMAPStore.RESPONSE;
        long j11 = j6 / j10;
        return C7124a.m13403a((int) ((j6 - (j10 * j11)) * 1000000), j11);
    }

    /* renamed from: b */
    public static final long m11703b(C7126c c7126c) {
        AbstractC4154l.m8923f(c7126c, "<this>");
        return (c7126c.f34346a.getEpochSecond() * IMAPStore.RESPONSE) + (r4.getNano() / 1000000);
    }

    /* renamed from: c */
    public static C2870a m11704c(String arn) {
        AbstractC4154l.m8923f(arn, "arn");
        List listM10111V = AbstractC5178p.m10111V(arn, new char[]{':'}, 6, 2);
        if (listM10111V.size() != 6) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("Malformed ARN (", arn, ") does not have the expected number of components").toString());
        }
        if (!AbstractC4154l.m8918a(listM10111V.get(0), "arn")) {
            throw new IllegalArgumentException("Malformed ARN - does not start with `arn:`");
        }
        if (AbstractC5178p.m10101L((CharSequence) listM10111V.get(1))) {
            throw new IllegalArgumentException("Malformed ARN - no AWS partition specified");
        }
        if (AbstractC5178p.m10101L((CharSequence) listM10111V.get(2))) {
            throw new IllegalArgumentException("Malformed ARN - no AWS service specified");
        }
        C0073l c0073l = new C0073l();
        c0073l.f264a = (String) listM10111V.get(1);
        c0073l.f265b = (String) listM10111V.get(2);
        Object obj = listM10111V.get(3);
        if (AbstractC5178p.m10101L((String) obj)) {
            obj = null;
        }
        c0073l.f266c = (String) obj;
        Object obj2 = listM10111V.get(4);
        c0073l.f267d = (String) (AbstractC5178p.m10101L((String) obj2) ? null : obj2);
        c0073l.f268e = (String) listM10111V.get(5);
        String str = (String) c0073l.f264a;
        if (str == null || AbstractC5178p.m10101L(str)) {
            throw new IllegalArgumentException("ARN partition must not be null or blank");
        }
        String str2 = (String) c0073l.f265b;
        if (str2 == null || AbstractC5178p.m10101L(str2)) {
            throw new IllegalArgumentException("ARN service must not be null or blank");
        }
        if (((String) c0073l.f268e) != null) {
            return new C2870a(c0073l);
        }
        throw new IllegalArgumentException("ARN resource must not be null");
    }

    /* renamed from: d */
    public static final long m11705d(C7126c c7126c, C7126c other) {
        AbstractC4154l.m8923f(other, "other");
        int i10 = C5770a.f28335d;
        return bb.m10552h(m11703b(other) - m11703b(c7126c), EnumC5772c.MILLISECONDS);
    }
}
