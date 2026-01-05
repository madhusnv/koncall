package og;

import a2.AbstractC0030c;
import com.sun.mail.imap.IMAPStore;
import java.util.Arrays;
import java.util.logging.Logger;
import mz.AbstractC4917a;
import mz.C4919c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26530a = 0;

    /* renamed from: a */
    public static final void m10695a(Logger logger, AbstractC4917a abstractC4917a, C4919c c4919c, String str) {
        logger.fine(c4919c.f24466b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC4917a.f24459a);
    }

    /* renamed from: b */
    public static final String m10696b(long j6) {
        String strM116g;
        if (j6 <= -999500000) {
            strM116g = AbstractC0030c.m116g((j6 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j6 <= -999500) {
            strM116g = AbstractC0030c.m116g((j6 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j6 <= 0) {
            strM116g = AbstractC0030c.m116g((j6 - 500) / IMAPStore.RESPONSE, " µs", new StringBuilder());
        } else if (j6 < 999500) {
            strM116g = AbstractC0030c.m116g((j6 + 500) / IMAPStore.RESPONSE, " µs", new StringBuilder());
        } else if (j6 < 999500000) {
            strM116g = AbstractC0030c.m116g((j6 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strM116g = AbstractC0030c.m116g((j6 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM116g}, 1));
    }
}
