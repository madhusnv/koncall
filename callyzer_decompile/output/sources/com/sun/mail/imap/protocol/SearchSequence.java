package com.sun.mail.imap.protocol;

import com.sun.mail.iap.Argument;
import com.sun.mail.imap.ModifiedSinceTerm;
import com.sun.mail.imap.OlderTerm;
import com.sun.mail.imap.YoungerTerm;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.C3681m;
import jakarta.mail.search.SearchException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import ow.AbstractC5758a;
import ow.AbstractC5759b;
import ow.AbstractC5761d;
import ow.AbstractC5763f;
import ow.AbstractC5764g;
import ow.AbstractC5765h;
import ow.AbstractC5767j;
import ow.AbstractC5768k;
import ow.AbstractC5769l;
import ow.C5762e;
import ow.C5766i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class SearchSequence {
    private static String[] monthTable = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    protected Calendar cal = new GregorianCalendar();
    private IMAPProtocol protocol;

    public SearchSequence(IMAPProtocol iMAPProtocol) {
        this.protocol = iMAPProtocol;
    }

    public static boolean isAscii(AbstractC5767j abstractC5767j) {
        if (abstractC5767j instanceof C5766i) {
            return isAscii((AbstractC5767j[]) ((C5766i) abstractC5767j).f28332a.clone());
        }
        return true;
    }

    public Argument and(AbstractC5758a abstractC5758a, String str) {
        throw null;
    }

    public Argument body(AbstractC5759b abstractC5759b, String str) {
        new Argument().writeAtom("BODY");
        throw null;
    }

    public Argument flag(C5762e c5762e) throws SearchException {
        boolean z6 = c5762e.f28330a;
        Argument argument = new Argument();
        C3678j c3678j = (C3678j) c5762e.f28331b.clone();
        C3651i[] systemFlags = c3678j.getSystemFlags();
        String[] userFlags = c3678j.getUserFlags();
        if (systemFlags.length == 0 && userFlags.length == 0) {
            throw new SearchException("Invalid FlagTerm");
        }
        for (C3651i c3651i : systemFlags) {
            if (c3651i == C3651i.f19324c) {
                argument.writeAtom(z6 ? "DELETED" : "UNDELETED");
            } else if (c3651i == C3651i.f19323b) {
                argument.writeAtom(z6 ? "ANSWERED" : "UNANSWERED");
            } else if (c3651i == C3651i.f19325d) {
                argument.writeAtom(z6 ? "DRAFT" : "UNDRAFT");
            } else if (c3651i == C3651i.f19326e) {
                argument.writeAtom(z6 ? "FLAGGED" : "UNFLAGGED");
            } else if (c3651i == C3651i.f19327f) {
                argument.writeAtom(z6 ? "RECENT" : "OLD");
            } else if (c3651i == C3651i.f19328g) {
                argument.writeAtom(z6 ? "SEEN" : "UNSEEN");
            }
        }
        for (String str : userFlags) {
            argument.writeAtom(z6 ? "KEYWORD" : "UNKEYWORD");
            argument.writeAtom(str);
        }
        return argument;
    }

    public Argument from(String str, String str2) {
        Argument argument = new Argument();
        argument.writeAtom("FROM");
        argument.writeString(str, str2);
        return argument;
    }

    public Argument generateSequence(AbstractC5767j abstractC5767j, String str) {
        if (abstractC5767j instanceof C5766i) {
            return or((C5766i) abstractC5767j, str);
        }
        if (abstractC5767j instanceof C5762e) {
            return flag((C5762e) abstractC5767j);
        }
        if (abstractC5767j instanceof OlderTerm) {
            return older((OlderTerm) abstractC5767j);
        }
        if (abstractC5767j instanceof YoungerTerm) {
            return younger((YoungerTerm) abstractC5767j);
        }
        if (abstractC5767j instanceof ModifiedSinceTerm) {
            return modifiedSince((ModifiedSinceTerm) abstractC5767j);
        }
        throw new SearchException("Search too complex");
    }

    public Argument header(AbstractC5763f abstractC5763f, String str) {
        new Argument().writeAtom("HEADER");
        throw null;
    }

    public Argument messageid(AbstractC5764g abstractC5764g, String str) {
        Argument argument = new Argument();
        argument.writeAtom("HEADER");
        argument.writeString("Message-ID");
        throw null;
    }

    public Argument modifiedSince(ModifiedSinceTerm modifiedSinceTerm) throws SearchException {
        IMAPProtocol iMAPProtocol = this.protocol;
        if (iMAPProtocol != null && !iMAPProtocol.hasCapability("CONDSTORE")) {
            throw new SearchException("Server doesn't support MODSEQ searches");
        }
        Argument argument = new Argument();
        argument.writeAtom("MODSEQ");
        argument.writeNumber(modifiedSinceTerm.getModSeq());
        return argument;
    }

    public Argument not(AbstractC5765h abstractC5765h, String str) {
        new Argument().writeAtom("NOT");
        throw null;
    }

    public Argument older(OlderTerm olderTerm) throws SearchException {
        IMAPProtocol iMAPProtocol = this.protocol;
        if (iMAPProtocol != null && !iMAPProtocol.hasCapability("WITHIN")) {
            throw new SearchException("Server doesn't support OLDER searches");
        }
        Argument argument = new Argument();
        argument.writeAtom("OLDER");
        argument.writeNumber(olderTerm.getInterval());
        return argument;
    }

    public Argument or(C5766i c5766i, String str) {
        AbstractC5767j[] abstractC5767jArr = (AbstractC5767j[]) c5766i.f28332a.clone();
        if (abstractC5767jArr.length > 2) {
            AbstractC5767j abstractC5767j = abstractC5767jArr[0];
            int i10 = 1;
            while (i10 < abstractC5767jArr.length) {
                AbstractC5767j abstractC5767j2 = abstractC5767jArr[i10];
                C5766i c5766i2 = new C5766i();
                c5766i2.f28332a = new AbstractC5767j[]{abstractC5767j, abstractC5767j2};
                i10++;
                abstractC5767j = c5766i2;
            }
            abstractC5767jArr = (AbstractC5767j[]) ((C5766i) abstractC5767j).f28332a.clone();
        }
        Argument argument = new Argument();
        if (abstractC5767jArr.length > 1) {
            argument.writeAtom("OR");
        }
        AbstractC5767j abstractC5767j3 = abstractC5767jArr[0];
        if (abstractC5767j3 instanceof C5762e) {
            argument.writeArgument(generateSequence(abstractC5767j3, str));
        } else {
            argument.append(generateSequence(abstractC5767j3, str));
        }
        if (abstractC5767jArr.length > 1) {
            AbstractC5767j abstractC5767j4 = abstractC5767jArr[1];
            if (abstractC5767j4 instanceof C5762e) {
                argument.writeArgument(generateSequence(abstractC5767j4, str));
                return argument;
            }
            argument.append(generateSequence(abstractC5767j4, str));
        }
        return argument;
    }

    public Argument receiveddate(AbstractC5761d abstractC5761d) {
        new Argument();
        throw null;
    }

    public Argument recipient(C3681m c3681m, String str, String str2) throws SearchException {
        Argument argument = new Argument();
        if (c3681m == C3681m.f19407b) {
            argument.writeAtom("TO");
        } else if (c3681m == C3681m.f19408c) {
            argument.writeAtom("CC");
        } else {
            if (c3681m != C3681m.f19409d) {
                throw new SearchException("Illegal Recipient type");
            }
            argument.writeAtom("BCC");
        }
        argument.writeString(str, str2);
        return argument;
    }

    public Argument sentdate(AbstractC5761d abstractC5761d) {
        new Argument();
        throw null;
    }

    public Argument size(AbstractC5768k abstractC5768k) {
        new Argument();
        throw null;
    }

    public Argument subject(AbstractC5769l abstractC5769l, String str) {
        new Argument().writeAtom("SUBJECT");
        throw null;
    }

    public String toIMAPDate(Date date) {
        StringBuilder sb2 = new StringBuilder();
        this.cal.setTime(date);
        sb2.append(this.cal.get(5));
        sb2.append("-");
        sb2.append(monthTable[this.cal.get(2)]);
        sb2.append('-');
        sb2.append(this.cal.get(1));
        return sb2.toString();
    }

    public Argument younger(YoungerTerm youngerTerm) throws SearchException {
        IMAPProtocol iMAPProtocol = this.protocol;
        if (iMAPProtocol != null && !iMAPProtocol.hasCapability("WITHIN")) {
            throw new SearchException("Server doesn't support YOUNGER searches");
        }
        Argument argument = new Argument();
        argument.writeAtom("YOUNGER");
        argument.writeNumber(youngerTerm.getInterval());
        return argument;
    }

    @Deprecated
    public SearchSequence() {
    }

    public static boolean isAscii(AbstractC5767j[] abstractC5767jArr) {
        for (AbstractC5767j abstractC5767j : abstractC5767jArr) {
            if (!isAscii(abstractC5767j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAscii(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) > 127) {
                return false;
            }
        }
        return true;
    }
}
