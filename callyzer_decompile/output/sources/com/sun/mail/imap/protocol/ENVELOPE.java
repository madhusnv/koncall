package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.PropUtil;
import jakarta.mail.internet.C3655d;
import jakarta.mail.internet.C3660i;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ENVELOPE implements Item {
    public C3655d[] bcc;

    /* renamed from: cc, reason: collision with root package name */
    public C3655d[] f43920cc;
    public Date date;
    public C3655d[] from;
    public String inReplyTo;
    public String messageId;
    public int msgno;
    public C3655d[] replyTo;
    public C3655d[] sender;
    public String subject;

    /* renamed from: to, reason: collision with root package name */
    public C3655d[] f43921to;
    static final char[] name = {'E', 'N', 'V', 'E', Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'P', 'E'};
    private static final C3660i mailDateFormat = new C3660i();
    private static final boolean parseDebug = PropUtil.getBooleanSystemProperty("mail.imap.parse.debug", false);

    public ENVELOPE(FetchResponse fetchResponse) throws ParsingException {
        this.date = null;
        if (parseDebug) {
            System.out.println("parse ENVELOPE");
        }
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 40) {
            throw new ParsingException("ENVELOPE parse error");
        }
        String string = fetchResponse.readString();
        if (string != null) {
            try {
                C3660i c3660i = mailDateFormat;
                synchronized (c3660i) {
                    this.date = c3660i.parse(string);
                }
            } catch (ParseException unused) {
            }
        }
        boolean z6 = parseDebug;
        if (z6) {
            System.out.println("  Date: " + this.date);
        }
        this.subject = fetchResponse.readString();
        if (z6) {
            System.out.println("  Subject: " + this.subject);
        }
        if (z6) {
            System.out.println("  From addresses:");
        }
        this.from = parseAddressList(fetchResponse);
        if (z6) {
            System.out.println("  Sender addresses:");
        }
        this.sender = parseAddressList(fetchResponse);
        if (z6) {
            System.out.println("  Reply-To addresses:");
        }
        this.replyTo = parseAddressList(fetchResponse);
        if (z6) {
            System.out.println("  To addresses:");
        }
        this.f43921to = parseAddressList(fetchResponse);
        if (z6) {
            System.out.println("  Cc addresses:");
        }
        this.f43920cc = parseAddressList(fetchResponse);
        if (z6) {
            System.out.println("  Bcc addresses:");
        }
        this.bcc = parseAddressList(fetchResponse);
        this.inReplyTo = fetchResponse.readString();
        if (z6) {
            System.out.println("  In-Reply-To: " + this.inReplyTo);
        }
        this.messageId = fetchResponse.readString();
        if (z6) {
            System.out.println("  Message-ID: " + this.messageId);
        }
        if (!fetchResponse.isNextNonSpace(')')) {
            throw new ParsingException("ENVELOPE parse error");
        }
    }

    private C3655d[] parseAddressList(Response response) throws ParsingException {
        response.skipSpaces();
        byte b10 = response.readByte();
        if (b10 != 40) {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("ADDRESS parse error");
            }
            response.skip(2);
            return null;
        }
        if (response.isNextNonSpace(')')) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            IMAPAddress iMAPAddress = new IMAPAddress(response);
            if (parseDebug) {
                System.out.println("    Address: " + iMAPAddress);
            }
            if (!iMAPAddress.isEndOfGroup()) {
                arrayList.add(iMAPAddress);
            }
        } while (!response.isNextNonSpace(')'));
        return (C3655d[]) arrayList.toArray(new C3655d[arrayList.size()]);
    }
}
