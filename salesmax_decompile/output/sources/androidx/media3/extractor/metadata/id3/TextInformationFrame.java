package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.TokenParser;
import p001o.br8;
import p001o.nf8;
import p001o.op0;
import p001o.sqi;
import p001o.xa8;

/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C2250a();

    /* renamed from: b */
    public final String f8695b;

    /* renamed from: c */
    public final String f8696c;

    /* renamed from: d */
    public final nf8 f8697d;

    /* renamed from: androidx.media3.extractor.metadata.id3.TextInformationFrame$a */
    public class C2250a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public /* synthetic */ TextInformationFrame(Parcel parcel, C2250a c2250a) {
        this(parcel);
    }

    /* renamed from: a */
    public static List m7565a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) throws NumberFormatException {
        String str = this.f8684a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    bVar.m6807O((CharSequence) this.f8697d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.m6812T((CharSequence) this.f8697d.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) this.f8697d.get(0);
                    bVar.g0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).f0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.m6808P((CharSequence) this.f8697d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.m6806N((CharSequence) this.f8697d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.m6813U((CharSequence) this.f8697d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrI1 = sqi.i1((String) this.f8697d.get(0), "/");
                    bVar.q0(Integer.valueOf(Integer.parseInt(strArrI1[0]))).p0(strArrI1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrI1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.n0((CharSequence) this.f8697d.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.r0((CharSequence) this.f8697d.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.h0(Integer.valueOf(Integer.parseInt((String) this.f8697d.get(0))));
                    break;
                case '\f':
                    Integer numM19647n = br8.m19647n((String) this.f8697d.get(0));
                    if (numM19647n != null) {
                        String strM55890a = xa8.m55890a(numM19647n.intValue());
                        if (strM55890a != null) {
                            bVar.b0(strM55890a);
                            break;
                        }
                    } else {
                        bVar.b0((CharSequence) this.f8697d.get(0));
                        break;
                    }
                    break;
                case 14:
                    List listM7565a = m7565a((String) this.f8697d.get(0));
                    int size = listM7565a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.f0((Integer) listM7565a.get(2));
                            }
                        }
                        bVar.g0((Integer) listM7565a.get(1));
                    }
                    bVar.h0((Integer) listM7565a.get(0));
                    break;
                case 15:
                    List listM7565a2 = m7565a((String) this.f8697d.get(0));
                    int size2 = listM7565a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.i0((Integer) listM7565a2.get(2));
                            }
                        }
                        bVar.j0((Integer) listM7565a2.get(1));
                    }
                    bVar.k0((Integer) listM7565a2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return sqi.m48724c(this.f8684a, textInformationFrame.f8684a) && sqi.m48724c(this.f8695b, textInformationFrame.f8695b) && this.f8697d.equals(textInformationFrame.f8697d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f8684a.hashCode()) * 31;
        String str = this.f8695b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f8697d.hashCode();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": description=" + this.f8695b + ": values=" + this.f8697d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8684a);
        parcel.writeString(this.f8695b);
        parcel.writeStringArray((String[]) this.f8697d.toArray(new String[0]));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        op0.m42511a(!list.isEmpty());
        this.f8695b = str2;
        nf8 nf8VarM40511y = nf8.m40511y(list);
        this.f8697d = nf8VarM40511y;
        this.f8696c = (String) nf8VarM40511y.get(0);
    }

    public TextInformationFrame(Parcel parcel) {
        this((String) op0.m42515e(parcel.readString()), parcel.readString(), nf8.m40512z((String[]) op0.m42515e(parcel.createStringArray())));
    }
}
