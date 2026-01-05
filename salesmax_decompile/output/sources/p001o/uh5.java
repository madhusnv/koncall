package p001o;

import androidx.media3.common.C2181a;
import java.util.Objects;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class uh5 implements qbg.InterfaceC16329a {
    @Override // p001o.qbg.InterfaceC16329a
    /* renamed from: a */
    public boolean mo45062a(C2181a c2181a) {
        String str = c2181a.f7943n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p001o.qbg.InterfaceC16329a
    /* renamed from: b */
    public int mo45063b(C2181a c2181a) {
        String str = c2181a.f7943n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // p001o.qbg.InterfaceC16329a
    /* renamed from: c */
    public qbg mo45064c(C2181a c2181a) {
        String str = c2181a.f7943n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new r16(c2181a.f7946q);
                case "application/pgs":
                    return new m6d();
                case "application/x-mp4-vtt":
                    return new gnb();
                case "text/vtt":
                    return new o6j();
                case "application/x-quicktime-tx3g":
                    return new yyh(c2181a.f7946q);
                case "text/x-ssa":
                    return new i1g(c2181a.f7946q);
                case "application/x-subrip":
                    return new pag();
                case "application/ttml+xml":
                    return new kyh();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
