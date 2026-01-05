package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.AbstractC1452a;
import com.sun.mail.util.PropUtil;
import jakarta.mail.internet.C3675x;
import jakarta.mail.internet.ParseException;
import java.util.ArrayList;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BODYSTRUCTURE implements Item {
    public String attachment;
    public BODYSTRUCTURE[] bodies;
    public C3675x cParams;
    public C3675x dParams;
    public String description;
    public String disposition;
    public String encoding;
    public ENVELOPE envelope;

    /* renamed from: id, reason: collision with root package name */
    public String f43919id;
    public String[] language;
    public int lines;
    public String md5;
    public int msgno;
    private int processedType;
    public int size;
    public String subtype;
    public String type;
    static final char[] name = {'B', 'O', 'D', 'Y', 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_UT, 'C', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'E'};
    private static int SINGLE = 1;
    private static int MULTI = 2;
    private static int NESTED = 3;
    private static final boolean parseDebug = PropUtil.getBooleanSystemProperty("mail.imap.parse.debug", false);

    public BODYSTRUCTURE(FetchResponse fetchResponse) throws ParsingException {
        this.lines = -1;
        this.size = -1;
        boolean z6 = parseDebug;
        if (z6) {
            System.out.println("DEBUG IMAP: parsing BODYSTRUCTURE");
        }
        this.msgno = fetchResponse.getNumber();
        if (z6) {
            System.out.println("DEBUG IMAP: msgno " + this.msgno);
        }
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 40) {
            throw new ParsingException("BODYSTRUCTURE parse error: missing ``('' at start");
        }
        if (fetchResponse.peekByte() == 40) {
            if (z6) {
                System.out.println("DEBUG IMAP: parsing multipart");
            }
            this.type = "multipart";
            this.processedType = MULTI;
            ArrayList arrayList = new ArrayList(1);
            do {
                arrayList.add(new BODYSTRUCTURE(fetchResponse));
                fetchResponse.skipSpaces();
            } while (fetchResponse.peekByte() == 40);
            this.bodies = (BODYSTRUCTURE[]) arrayList.toArray(new BODYSTRUCTURE[arrayList.size()]);
            this.subtype = fetchResponse.readString();
            boolean z10 = parseDebug;
            if (z10) {
                System.out.println("DEBUG IMAP: subtype " + this.subtype);
            }
            if (fetchResponse.isNextNonSpace(')')) {
                if (z10) {
                    System.out.println("DEBUG IMAP: parse DONE");
                    return;
                }
                return;
            }
            if (z10) {
                System.out.println("DEBUG IMAP: parsing extension data");
            }
            this.cParams = parseParameters(fetchResponse);
            if (fetchResponse.isNextNonSpace(')')) {
                if (z10) {
                    System.out.println("DEBUG IMAP: body parameters DONE");
                    return;
                }
                return;
            }
            byte bPeekByte = fetchResponse.peekByte();
            if (bPeekByte == 40) {
                if (z10) {
                    System.out.println("DEBUG IMAP: parse disposition");
                }
                fetchResponse.readByte();
                this.disposition = fetchResponse.readString();
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition " + this.disposition);
                }
                this.dParams = parseParameters(fetchResponse);
                if (!fetchResponse.isNextNonSpace(')')) {
                    throw new ParsingException("BODYSTRUCTURE parse error: missing ``)'' at end of disposition in multipart");
                }
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition DONE");
                }
            } else {
                if (bPeekByte != 78 && bPeekByte != 110) {
                    if (z10) {
                        System.out.println("DEBUG IMAP: bad multipart disposition, applying Exchange bug workaround");
                    }
                    this.description = fetchResponse.readString();
                    if (z10) {
                        System.out.println("DEBUG IMAP: multipart description " + this.description);
                    }
                    while (fetchResponse.readByte() == 32) {
                        parseBodyExtension(fetchResponse);
                    }
                    return;
                }
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition NIL");
                }
                fetchResponse.skip(3);
            }
            if (fetchResponse.isNextNonSpace(')')) {
                if (z10) {
                    System.out.println("DEBUG IMAP: no body-fld-lang");
                    return;
                }
                return;
            }
            if (fetchResponse.peekByte() == 40) {
                this.language = fetchResponse.readStringList();
                if (z10) {
                    System.out.println("DEBUG IMAP: language len " + this.language.length);
                }
            } else {
                String string = fetchResponse.readString();
                if (string != null) {
                    this.language = new String[]{string};
                    if (z10) {
                        System.out.println("DEBUG IMAP: language ".concat(string));
                    }
                }
            }
            while (fetchResponse.readByte() == 32) {
                parseBodyExtension(fetchResponse);
            }
            return;
        }
        if (fetchResponse.peekByte() == 41) {
            throw new ParsingException("BODYSTRUCTURE parse error: missing body content");
        }
        if (z6) {
            System.out.println("DEBUG IMAP: single part");
        }
        this.type = fetchResponse.readString();
        if (z6) {
            System.out.println("DEBUG IMAP: type " + this.type);
        }
        this.processedType = SINGLE;
        this.subtype = fetchResponse.readString();
        if (z6) {
            System.out.println("DEBUG IMAP: subtype " + this.subtype);
        }
        if (this.type == null) {
            this.type = "application";
            this.subtype = "octet-stream";
        }
        this.cParams = parseParameters(fetchResponse);
        if (z6) {
            System.out.println("DEBUG IMAP: cParams " + this.cParams);
        }
        this.f43919id = fetchResponse.readString();
        if (z6) {
            System.out.println("DEBUG IMAP: id " + this.f43919id);
        }
        this.description = fetchResponse.readString();
        if (z6) {
            System.out.println("DEBUG IMAP: description " + this.description);
        }
        String atomString = fetchResponse.readAtomString();
        this.encoding = atomString;
        if (atomString != null && atomString.equalsIgnoreCase("NIL")) {
            if (z6) {
                System.out.println("DEBUG IMAP: NIL encoding, applying Exchange bug workaround");
            }
            this.encoding = null;
        }
        String str = this.encoding;
        if (str != null) {
            this.encoding = str.trim();
        }
        if (z6) {
            System.out.println("DEBUG IMAP: encoding " + this.encoding);
        }
        this.size = fetchResponse.readNumber();
        if (z6) {
            System.out.println("DEBUG IMAP: size " + this.size);
        }
        if (this.size < 0) {
            throw new ParsingException("BODYSTRUCTURE parse error: bad ``size'' element");
        }
        if (this.type.equalsIgnoreCase(TextBundle.TEXT_ENTRY)) {
            this.lines = fetchResponse.readNumber();
            if (z6) {
                System.out.println("DEBUG IMAP: lines " + this.lines);
            }
            if (this.lines < 0) {
                throw new ParsingException("BODYSTRUCTURE parse error: bad ``lines'' element");
            }
        } else if (this.type.equalsIgnoreCase("message") && this.subtype.equalsIgnoreCase("rfc822")) {
            this.processedType = NESTED;
            fetchResponse.skipSpaces();
            if (fetchResponse.peekByte() == 40) {
                this.envelope = new ENVELOPE(fetchResponse);
                if (z6) {
                    System.out.println("DEBUG IMAP: got envelope of nested message");
                }
                this.bodies = new BODYSTRUCTURE[]{new BODYSTRUCTURE(fetchResponse)};
                this.lines = fetchResponse.readNumber();
                if (z6) {
                    System.out.println("DEBUG IMAP: lines " + this.lines);
                }
                if (this.lines < 0) {
                    throw new ParsingException("BODYSTRUCTURE parse error: bad ``lines'' element");
                }
            } else if (z6) {
                System.out.println("DEBUG IMAP: missing envelope and body of nested message");
            }
        } else {
            fetchResponse.skipSpaces();
            if (Character.isDigit((char) fetchResponse.peekByte())) {
                throw new ParsingException("BODYSTRUCTURE parse error: server erroneously included ``lines'' element with type " + this.type + "/" + this.subtype);
            }
        }
        if (fetchResponse.isNextNonSpace(')')) {
            if (z6) {
                System.out.println("DEBUG IMAP: parse DONE");
                return;
            }
            return;
        }
        this.md5 = fetchResponse.readString();
        if (fetchResponse.isNextNonSpace(')')) {
            if (z6) {
                System.out.println("DEBUG IMAP: no MD5 DONE");
                return;
            }
            return;
        }
        byte b10 = fetchResponse.readByte();
        if (b10 == 40) {
            this.disposition = fetchResponse.readString();
            if (z6) {
                System.out.println("DEBUG IMAP: disposition " + this.disposition);
            }
            this.dParams = parseParameters(fetchResponse);
            if (z6) {
                System.out.println("DEBUG IMAP: dParams " + this.dParams);
            }
            if (!fetchResponse.isNextNonSpace(')')) {
                throw new ParsingException("BODYSTRUCTURE parse error: missing ``)'' at end of disposition");
            }
        } else {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("BODYSTRUCTURE parse error: " + this.type + "/" + this.subtype + ": bad single part disposition, b " + ((int) b10));
            }
            if (z6) {
                System.out.println("DEBUG IMAP: disposition NIL");
            }
            fetchResponse.skip(2);
        }
        if (fetchResponse.isNextNonSpace(')')) {
            if (z6) {
                System.out.println("DEBUG IMAP: disposition DONE");
                return;
            }
            return;
        }
        if (fetchResponse.peekByte() == 40) {
            this.language = fetchResponse.readStringList();
            if (z6) {
                System.out.println("DEBUG IMAP: language len " + this.language.length);
            }
        } else {
            String string2 = fetchResponse.readString();
            if (string2 != null) {
                this.language = new String[]{string2};
                if (z6) {
                    System.out.println("DEBUG IMAP: language ".concat(string2));
                }
            }
        }
        while (fetchResponse.readByte() == 32) {
            parseBodyExtension(fetchResponse);
        }
        if (parseDebug) {
            System.out.println("DEBUG IMAP: all DONE");
        }
    }

    private void parseBodyExtension(Response response) {
        response.skipSpaces();
        byte bPeekByte = response.peekByte();
        if (bPeekByte == 40) {
            response.skip(1);
            do {
                parseBodyExtension(response);
            } while (!response.isNextNonSpace(')'));
        } else if (Character.isDigit((char) bPeekByte)) {
            response.readNumber();
        } else {
            response.readString();
        }
    }

    private C3675x parseParameters(Response response) throws ParsingException {
        response.skipSpaces();
        byte b10 = response.readByte();
        if (b10 != 40) {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("Parameter list parse error");
            }
            if (parseDebug) {
                System.out.println("DEBUG IMAP: parameter list NIL");
            }
            response.skip(2);
            return null;
        }
        C3675x c3675x = new C3675x();
        do {
            String string = response.readString();
            boolean z6 = parseDebug;
            if (z6) {
                System.out.println("DEBUG IMAP: parameter name " + string);
            }
            if (string == null) {
                StringBuilder sb2 = new StringBuilder("BODYSTRUCTURE parse error: ");
                sb2.append(this.type);
                sb2.append("/");
                throw new ParsingException(AbstractC1452a.m4564k(sb2, this.subtype, ": null name in parameter list"));
            }
            String string2 = response.readString();
            if (z6) {
                System.out.println("DEBUG IMAP: parameter value " + string2);
            }
            if (string2 == null) {
                if (z6) {
                    System.out.println("DEBUG IMAP: NIL parameter value, applying Exchange bug workaround");
                }
                string2 = "";
            }
            c3675x.m8263g(string, string2);
        } while (!response.isNextNonSpace(')'));
        if (C3675x.f19392f && c3675x.f19400b.size() > 0) {
            try {
                c3675x.m8260a(true);
            } catch (ParseException unused) {
            }
        }
        return c3675x;
    }

    public boolean isMulti() {
        return this.processedType == MULTI;
    }

    public boolean isNested() {
        return this.processedType == NESTED;
    }

    public boolean isSingle() {
        return this.processedType == SINGLE;
    }
}
