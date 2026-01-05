package p001o;

import java.util.Arrays;
import java.util.logging.Logger;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class sog {
    /* renamed from: b */
    public static final String m48592b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(...)");
        return str2;
    }

    /* renamed from: c */
    public static final void m48593c(Logger logger, wjg wjgVar, tog togVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(togVar.m50268h());
        sb.append(TokenParser.SP);
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(...)");
        sb.append(str2);
        sb.append(": ");
        sb.append(wjgVar.m54642b());
        logger.fine(sb.toString());
    }
}
