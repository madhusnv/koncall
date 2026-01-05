package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public abstract class aeb {
    /* renamed from: a */
    public static CommentFrame m16954a(int i, zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (zwcVar.m60036q() == 1684108385) {
            zwcVar.m60018V(8);
            String strM59999C = zwcVar.m59999C(iM60036q - 16);
            return new CommentFrame("und", strM59999C, strM59999C);
        }
        ria.m46824h("MetadataUtil", "Failed to parse comment attribute: " + js0.m34445a(i));
        return null;
    }

    /* renamed from: b */
    public static ApicFrame m16955b(zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (zwcVar.m60036q() != 1684108385) {
            ria.m46824h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM34446b = js0.m34446b(zwcVar.m60036q());
        String str = iM34446b == 13 ? "image/jpeg" : iM34446b == 14 ? "image/png" : null;
        if (str == null) {
            ria.m46824h("MetadataUtil", "Unrecognized cover art flags: " + iM34446b);
            return null;
        }
        zwcVar.m60018V(4);
        int i = iM60036q - 16;
        byte[] bArr = new byte[i];
        zwcVar.m60031l(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    /* renamed from: c */
    public static Metadata.Entry m16956c(zwc zwcVar) {
        int iM60025f = zwcVar.m60025f() + zwcVar.m60036q();
        int iM60036q = zwcVar.m60036q();
        int i = (iM60036q >> 24) & Constants.MAX_HOST_LENGTH;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM60036q;
                if (i2 == 6516084) {
                    return m16954a(iM60036q, zwcVar);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return m16963j(iM60036q, "TIT2", zwcVar);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return m16963j(iM60036q, "TCOM", zwcVar);
                }
                if (i2 == 6578553) {
                    return m16963j(iM60036q, "TDRC", zwcVar);
                }
                if (i2 == 4280916) {
                    return m16963j(iM60036q, "TPE1", zwcVar);
                }
                if (i2 == 7630703) {
                    return m16963j(iM60036q, "TSSE", zwcVar);
                }
                if (i2 == 6384738) {
                    return m16963j(iM60036q, "TALB", zwcVar);
                }
                if (i2 == 7108978) {
                    return m16963j(iM60036q, "USLT", zwcVar);
                }
                if (i2 == 6776174) {
                    return m16963j(iM60036q, "TCON", zwcVar);
                }
                if (i2 == 6779504) {
                    return m16963j(iM60036q, "TIT1", zwcVar);
                }
            } else {
                if (iM60036q == 1735291493) {
                    return m16962i(zwcVar);
                }
                if (iM60036q == 1684632427) {
                    return m16957d(iM60036q, "TPOS", zwcVar);
                }
                if (iM60036q == 1953655662) {
                    return m16957d(iM60036q, "TRCK", zwcVar);
                }
                if (iM60036q == 1953329263) {
                    return m16959f(iM60036q, "TBPM", zwcVar, true, false);
                }
                if (iM60036q == 1668311404) {
                    return m16959f(iM60036q, "TCMP", zwcVar, true, true);
                }
                if (iM60036q == 1668249202) {
                    return m16955b(zwcVar);
                }
                if (iM60036q == 1631670868) {
                    return m16963j(iM60036q, "TPE2", zwcVar);
                }
                if (iM60036q == 1936682605) {
                    return m16963j(iM60036q, "TSOT", zwcVar);
                }
                if (iM60036q == 1936679276) {
                    return m16963j(iM60036q, "TSOA", zwcVar);
                }
                if (iM60036q == 1936679282) {
                    return m16963j(iM60036q, "TSOP", zwcVar);
                }
                if (iM60036q == 1936679265) {
                    return m16963j(iM60036q, "TSO2", zwcVar);
                }
                if (iM60036q == 1936679791) {
                    return m16963j(iM60036q, "TSOC", zwcVar);
                }
                if (iM60036q == 1920233063) {
                    return m16959f(iM60036q, "ITUNESADVISORY", zwcVar, false, false);
                }
                if (iM60036q == 1885823344) {
                    return m16959f(iM60036q, "ITUNESGAPLESS", zwcVar, false, true);
                }
                if (iM60036q == 1936683886) {
                    return m16963j(iM60036q, "TVSHOWSORT", zwcVar);
                }
                if (iM60036q == 1953919848) {
                    return m16963j(iM60036q, "TVSHOW", zwcVar);
                }
                if (iM60036q == 757935405) {
                    return m16960g(zwcVar, iM60025f);
                }
            }
            ria.m46818b("MetadataUtil", "Skipped unknown metadata entry: " + js0.m34445a(iM60036q));
            zwcVar.m60017U(iM60025f);
            return null;
        } finally {
            zwcVar.m60017U(iM60025f);
        }
    }

    /* renamed from: d */
    public static TextInformationFrame m16957d(int i, String str, zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (zwcVar.m60036q() == 1684108385 && iM60036q >= 22) {
            zwcVar.m60018V(10);
            int iM60010N = zwcVar.m60010N();
            if (iM60010N > 0) {
                String str2 = "" + iM60010N;
                int iM60010N2 = zwcVar.m60010N();
                if (iM60010N2 > 0) {
                    str2 = str2 + "/" + iM60010N2;
                }
                return new TextInformationFrame(str, null, nf8.m40500F(str2));
            }
        }
        ria.m46824h("MetadataUtil", "Failed to parse index/count attribute: " + js0.m34445a(i));
        return null;
    }

    /* renamed from: e */
    public static int m16958e(zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (zwcVar.m60036q() == 1684108385) {
            zwcVar.m60018V(8);
            int i = iM60036q - 16;
            if (i == 1) {
                return zwcVar.m60004H();
            }
            if (i == 2) {
                return zwcVar.m60010N();
            }
            if (i == 3) {
                return zwcVar.m60007K();
            }
            if (i == 4 && (zwcVar.m60029j() & 128) == 0) {
                return zwcVar.m60008L();
            }
        }
        ria.m46824h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: f */
    public static Id3Frame m16959f(int i, String str, zwc zwcVar, boolean z, boolean z2) {
        int iM16958e = m16958e(zwcVar);
        if (z2) {
            iM16958e = Math.min(1, iM16958e);
        }
        if (iM16958e >= 0) {
            return z ? new TextInformationFrame(str, null, nf8.m40500F(Integer.toString(iM16958e))) : new CommentFrame("und", str, Integer.toString(iM16958e));
        }
        ria.m46824h("MetadataUtil", "Failed to parse uint8 attribute: " + js0.m34445a(i));
        return null;
    }

    /* renamed from: g */
    public static Id3Frame m16960g(zwc zwcVar, int i) {
        String strM59999C = null;
        String strM59999C2 = null;
        int i2 = -1;
        int i3 = -1;
        while (zwcVar.m60025f() < i) {
            int iM60025f = zwcVar.m60025f();
            int iM60036q = zwcVar.m60036q();
            int iM60036q2 = zwcVar.m60036q();
            zwcVar.m60018V(4);
            if (iM60036q2 == 1835360622) {
                strM59999C = zwcVar.m59999C(iM60036q - 12);
            } else if (iM60036q2 == 1851878757) {
                strM59999C2 = zwcVar.m59999C(iM60036q - 12);
            } else {
                if (iM60036q2 == 1684108385) {
                    i2 = iM60025f;
                    i3 = iM60036q;
                }
                zwcVar.m60018V(iM60036q - 12);
            }
        }
        if (strM59999C == null || strM59999C2 == null || i2 == -1) {
            return null;
        }
        zwcVar.m60017U(i2);
        zwcVar.m60018V(16);
        return new InternalFrame(strM59999C, strM59999C2, zwcVar.m59999C(i3 - 16));
    }

    /* renamed from: h */
    public static MdtaMetadataEntry m16961h(zwc zwcVar, int i, String str) {
        while (true) {
            int iM60025f = zwcVar.m60025f();
            if (iM60025f >= i) {
                return null;
            }
            int iM60036q = zwcVar.m60036q();
            if (zwcVar.m60036q() == 1684108385) {
                int iM60036q2 = zwcVar.m60036q();
                int iM60036q3 = zwcVar.m60036q();
                int i2 = iM60036q - 16;
                byte[] bArr = new byte[i2];
                zwcVar.m60031l(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iM60036q3, iM60036q2);
            }
            zwcVar.m60017U(iM60025f + iM60036q);
        }
    }

    /* renamed from: i */
    public static TextInformationFrame m16962i(zwc zwcVar) {
        String strM55890a = xa8.m55890a(m16958e(zwcVar) - 1);
        if (strM55890a != null) {
            return new TextInformationFrame("TCON", null, nf8.m40500F(strM55890a));
        }
        ria.m46824h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: j */
    public static TextInformationFrame m16963j(int i, String str, zwc zwcVar) {
        int iM60036q = zwcVar.m60036q();
        if (zwcVar.m60036q() == 1684108385) {
            zwcVar.m60018V(8);
            return new TextInformationFrame(str, null, nf8.m40500F(zwcVar.m59999C(iM60036q - 16)));
        }
        ria.m46824h("MetadataUtil", "Failed to parse text attribute: " + js0.m34445a(i));
        return null;
    }

    /* renamed from: k */
    public static void m16964k(int i, gn7 gn7Var, C2181a.b bVar) {
        if (i == 1 && gn7Var.m29148a()) {
            bVar.m6759V(gn7Var.f25554a).m6760W(gn7Var.f25555b);
        }
    }

    /* renamed from: l */
    public static void m16965l(int i, Metadata metadata, C2181a.b bVar, Metadata... metadataArr) {
        Metadata metadata2 = new Metadata(new Metadata.Entry[0]);
        if (metadata != null) {
            for (int i2 = 0; i2 < metadata.m6697e(); i2++) {
                Metadata.Entry entryM6696d = metadata.m6696d(i2);
                if (entryM6696d instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryM6696d;
                    if (!mdtaMetadataEntry.f8076a.equals("com.android.capture.fps")) {
                        metadata2 = metadata2.m6693a(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata2 = metadata2.m6693a(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.m6694b(metadata3);
        }
        if (metadata2.m6697e() > 0) {
            bVar.h0(metadata2);
        }
    }
}
