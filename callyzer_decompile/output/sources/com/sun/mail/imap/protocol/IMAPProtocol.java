package com.sun.mail.imap.protocol;

import com.sun.mail.auth.Ntlm;
import com.sun.mail.iap.Argument;
import com.sun.mail.iap.BadCommandException;
import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.CommandFailedException;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.Literal;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.ACL;
import com.sun.mail.imap.AppendUID;
import com.sun.mail.imap.CopyUID;
import com.sun.mail.imap.ResyncData;
import com.sun.mail.imap.Rights;
import com.sun.mail.imap.SortTerm;
import com.sun.mail.imap.Utility;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import i0.m0;
import jakarta.mail.C3651i;
import jakarta.mail.C3678j;
import jakarta.mail.C3689u;
import jakarta.mail.C3694v;
import jakarta.mail.internet.AbstractC3670s;
import jakarta.mail.search.SearchException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import ow.AbstractC5767j;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IMAPProtocol extends Protocol {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean authenticated;
    private List<String> authmechs;

    /* renamed from: ba, reason: collision with root package name */
    private ByteArray f43922ba;
    private Map<String, String> capabilities;
    private boolean connected;
    protected Set<String> enabled;
    private volatile String idleTag;
    private String name;
    private boolean noauthdebug;
    private String proxyAuthUser;
    private boolean referralException;
    private boolean rev1;
    private SaslAuthenticator saslAuthenticator;
    protected String[] searchCharsets;
    protected SearchSequence searchSequence;
    private boolean utf8;
    private static final byte[] CRLF = {13, 10};
    private static final FetchItem[] fetchItems = new FetchItem[0];
    private static final byte[] DONE = {68, 79, 78, 69, 13, 10};

    public IMAPProtocol(String str, String str2, int i10, Properties properties, boolean z6, MailLogger mailLogger) {
        super(str2, i10, properties, m0.m7378k("mail.", str), z6, mailLogger);
        this.connected = false;
        this.rev1 = false;
        this.noauthdebug = true;
        try {
            this.name = str;
            this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
            this.referralException = PropUtil.getBooleanProperty(properties, this.prefix + ".referralexception", false);
            if (this.capabilities == null) {
                capability();
            }
            if (hasCapability("IMAP4rev1")) {
                this.rev1 = true;
            }
            this.searchCharsets = new String[]{"UTF-8", AbstractC3670s.m8252p(AbstractC3670s.m8246j())};
            this.connected = true;
        } finally {
        }
    }

    private void checkReferral(Response response) throws IMAPReferralException {
        int iIndexOf;
        String strSubstring;
        String strTrim;
        String rest = response.getRest();
        if (rest.startsWith("[") && (iIndexOf = rest.indexOf(32)) > 0 && rest.substring(1, iIndexOf).equalsIgnoreCase("REFERRAL")) {
            int iIndexOf2 = rest.indexOf(93);
            if (iIndexOf2 > 0) {
                strSubstring = rest.substring(iIndexOf + 1, iIndexOf2);
                strTrim = rest.substring(iIndexOf2 + 1).trim();
            } else {
                strSubstring = rest.substring(iIndexOf + 1);
                strTrim = "";
            }
            if (response.isBYE()) {
                disconnect();
            }
            throw new IMAPReferralException(strTrim, strSubstring);
        }
    }

    private AppendUID getAppendUID(Response response) {
        byte b10;
        if (!response.isOK()) {
            return null;
        }
        do {
            b10 = response.readByte();
            if (b10 <= 0) {
                break;
            }
        } while (b10 != 91);
        if (b10 != 0 && response.readAtom().equalsIgnoreCase("APPENDUID")) {
            return new AppendUID(response.readLong(), response.readLong());
        }
        return null;
    }

    private int[] issueSearch(String str, AbstractC5767j abstractC5767j, String str2) throws CommandFailedException, BadCommandException, ConnectionException {
        int[] iArr = null;
        Argument argumentGenerateSequence = getSearchSequence().generateSequence(abstractC5767j, str2 == null ? null : AbstractC3670s.m8249m(str2));
        argumentGenerateSequence.writeAtom(str);
        Response[] responseArrCommand = str2 == null ? command("SEARCH", argumentGenerateSequence) : command("SEARCH CHARSET ".concat(str2), argumentGenerateSequence);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList();
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("SEARCH")) {
                        while (true) {
                            int number = iMAPResponse.readNumber();
                            if (number == -1) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(number));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return iArr;
    }

    private C3694v parseQuota(Response response) throws ParsingException {
        C3694v c3694v = new C3694v(response.readAtomString());
        response.skipSpaces();
        if (response.readByte() != 40) {
            throw new ParsingException("parse error in QUOTA");
        }
        ArrayList arrayList = new ArrayList();
        while (!response.isNextNonSpace(')')) {
            String atom = response.readAtom();
            if (atom != null) {
                response.readLong();
                long j6 = response.readLong();
                C3689u c3689u = new C3689u();
                c3689u.f19420a = atom;
                c3689u.f19421b = j6;
                arrayList.add(c3689u);
            }
        }
        c3694v.f19429b = (C3689u[]) arrayList.toArray(new C3689u[arrayList.size()]);
        return c3694v;
    }

    private static Argument resyncArgs(ResyncData resyncData) {
        Argument argument = new Argument();
        argument.writeAtom("QRESYNC");
        Argument argument2 = new Argument();
        argument2.writeNumber(resyncData.getUIDValidity());
        argument2.writeNumber(resyncData.getModSeq());
        UIDSet[] resyncUIDSet = Utility.getResyncUIDSet(resyncData);
        if (resyncUIDSet != null) {
            argument2.writeString(UIDSet.toString(resyncUIDSet));
        }
        argument.writeArgument(argument2);
        return argument;
    }

    public void append(String str, C3678j c3678j, Date date, Literal literal) {
        appenduid(str, c3678j, date, literal, false);
    }

    public AppendUID appenduid(String str, C3678j c3678j, Date date, Literal literal) {
        return appenduid(str, c3678j, date, literal, true);
    }

    public synchronized void authlogin(String str, String str2) {
        Response responseByeResponse;
        boolean z6;
        String str3;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE LOGIN command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    responseByeResponse = null;
                    strWriteCommand = writeCommand("AUTHENTICATE LOGIN", null);
                    z6 = false;
                } catch (Exception e2) {
                    responseByeResponse = Response.byeResponse(e2);
                    z6 = true;
                }
                OutputStream outputStream = getOutputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
                boolean z10 = true;
                while (!z6) {
                    try {
                        responseByeResponse = readResponse();
                    } catch (Exception e10) {
                        responseByeResponse = Response.byeResponse(e10);
                    }
                    if (responseByeResponse.isContinuation()) {
                        if (z10) {
                            str3 = str;
                            z10 = false;
                        } else {
                            str3 = str2;
                        }
                        bASE64EncoderStream.write(str3.getBytes(StandardCharsets.UTF_8));
                        bASE64EncoderStream.flush();
                        byteArrayOutputStream.write(CRLF);
                        outputStream.write(byteArrayOutputStream.toByteArray());
                        outputStream.flush();
                        byteArrayOutputStream.reset();
                    } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                        z6 = true;
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE LOGIN command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.authenticated = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authntlm(String str, String str2, String str3) {
        Response responseByeResponse;
        boolean z6;
        boolean z10;
        String strGenerateType3Msg;
        try {
            ArrayList arrayList = new ArrayList();
            int intProperty = PropUtil.getIntProperty(this.props, "mail." + this.name + ".auth.ntlm.flags", 0);
            boolean booleanProperty = PropUtil.getBooleanProperty(this.props, "mail." + this.name + ".auth.ntlm.v2", true);
            Ntlm ntlm = new Ntlm(this.props.getProperty("mail." + this.name + ".auth.ntlm.domain", ""), getLocalHost(), str2, str3, this.logger);
            try {
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE NTLM command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    strWriteCommand = writeCommand("AUTHENTICATE NTLM", null);
                    responseByeResponse = null;
                    z6 = false;
                } catch (Exception e2) {
                    responseByeResponse = Response.byeResponse(e2);
                    z6 = true;
                }
                OutputStream outputStream = getOutputStream();
                boolean z11 = true;
                while (!z6) {
                    try {
                        responseByeResponse = readResponse();
                    } catch (Exception e10) {
                        e = e10;
                    }
                    if (responseByeResponse.isContinuation()) {
                        if (z11) {
                            strGenerateType3Msg = ntlm.generateType1Msg(intProperty, booleanProperty);
                            z10 = false;
                        } else {
                            z10 = z11;
                            strGenerateType3Msg = ntlm.generateType3Msg(responseByeResponse.getRest());
                        }
                        try {
                            outputStream.write(strGenerateType3Msg.getBytes(StandardCharsets.UTF_8));
                            outputStream.write(CRLF);
                            outputStream.flush();
                            z11 = z10;
                        } catch (Exception e11) {
                            e = e11;
                            z11 = z10;
                            responseByeResponse = Response.byeResponse(e);
                            z6 = true;
                            arrayList.add(responseByeResponse);
                        }
                    } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                        z6 = true;
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE NTLM command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.authenticated = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authoauth2(String str, String str2) {
        Response responseByeResponse;
        boolean z6;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE XOAUTH2 command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    Argument argument = new Argument();
                    argument.writeAtom("XOAUTH2");
                    z6 = false;
                    if (hasCapability("SASL-IR")) {
                        byte[] bArrEncode = BASE64EncoderStream.encode(("user=" + str + "\u0001auth=Bearer " + str2 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8));
                        argument.writeAtom(ASCIIUtility.toString(bArrEncode, 0, bArrEncode.length));
                    }
                    strWriteCommand = writeCommand("AUTHENTICATE", argument);
                    responseByeResponse = null;
                } catch (Exception e2) {
                    responseByeResponse = Response.byeResponse(e2);
                    z6 = true;
                }
                OutputStream outputStream = getOutputStream();
                while (!z6) {
                    try {
                        responseByeResponse = readResponse();
                    } catch (Exception e10) {
                        responseByeResponse = Response.byeResponse(e10);
                    }
                    if (responseByeResponse.isContinuation()) {
                        outputStream.write(BASE64EncoderStream.encode(("user=" + str + "\u0001auth=Bearer " + str2 + "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
                        outputStream.write(CRLF);
                        outputStream.flush();
                    } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                        z6 = true;
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE XOAUTH2 command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.authenticated = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void authplain(String str, String str2, String str3) {
        Response responseByeResponse;
        boolean z6;
        try {
            ArrayList arrayList = new ArrayList();
            try {
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE PLAIN command trace suppressed");
                    suspendTracing();
                }
                String strWriteCommand = null;
                try {
                    z6 = false;
                    responseByeResponse = null;
                    strWriteCommand = writeCommand("AUTHENTICATE PLAIN", null);
                } catch (Exception e2) {
                    responseByeResponse = Response.byeResponse(e2);
                    z6 = true;
                }
                OutputStream outputStream = getOutputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
                while (!z6) {
                    try {
                        responseByeResponse = readResponse();
                    } catch (Exception e10) {
                        responseByeResponse = Response.byeResponse(e10);
                    }
                    if (responseByeResponse.isContinuation()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str == null ? "" : str);
                        sb2.append("\u0000");
                        sb2.append(str2);
                        sb2.append("\u0000");
                        sb2.append(str3);
                        bASE64EncoderStream.write(sb2.toString().getBytes(StandardCharsets.UTF_8));
                        bASE64EncoderStream.flush();
                        byteArrayOutputStream.write(CRLF);
                        outputStream.write(byteArrayOutputStream.toByteArray());
                        outputStream.flush();
                        byteArrayOutputStream.reset();
                    } else if ((responseByeResponse.isTagged() && responseByeResponse.getTag().equals(strWriteCommand)) || responseByeResponse.isBYE()) {
                        z6 = true;
                    }
                    arrayList.add(responseByeResponse);
                }
                resumeTracing();
                Response[] responseArr = (Response[]) arrayList.toArray(new Response[arrayList.size()]);
                handleCapabilityResponse(responseArr);
                notifyResponseHandlers(responseArr);
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("AUTHENTICATE PLAIN command result: " + responseByeResponse);
                }
                handleLoginResult(responseByeResponse);
                setCapabilities(responseByeResponse);
                this.authenticated = true;
            } catch (Throwable th2) {
                resumeTracing();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void capability() {
        Response[] responseArrCommand = command("CAPABILITY", null);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            handleCapabilityResponse(responseArrCommand);
        }
        handleResult(response);
    }

    public void check() throws CommandFailedException, BadCommandException, ConnectionException {
        simpleCommand("CHECK", null);
    }

    public void close() throws CommandFailedException, BadCommandException, ConnectionException {
        simpleCommand("CLOSE", null);
    }

    public void compress() {
        try {
            super.startCompression("COMPRESS DEFLATE");
        } catch (ProtocolException e2) {
            this.logger.log(Level.FINE, "COMPRESS ProtocolException", (Throwable) e2);
            throw e2;
        } catch (Exception e10) {
            this.logger.log(Level.FINE, "COMPRESS Exception", (Throwable) e10);
            notifyResponseHandlers(new Response[]{Response.byeResponse(e10)});
            disconnect();
            throw new ProtocolException("COMPRESS failure", e10);
        }
    }

    public void copy(MessageSet[] messageSetArr, String str) throws CommandFailedException, BadCommandException, ConnectionException {
        copyuid(MessageSet.toString(messageSetArr), str, false);
    }

    public CopyUID copyuid(MessageSet[] messageSetArr, String str) {
        return copyuid(MessageSet.toString(messageSetArr), str, true);
    }

    public void create(String str) {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("CREATE", argument);
    }

    public String createFlagList(C3678j c3678j) {
        String str;
        StringBuilder sb2 = new StringBuilder("(");
        boolean z6 = true;
        for (C3651i c3651i : c3678j.getSystemFlags()) {
            if (c3651i == C3651i.f19323b) {
                str = "\\Answered";
            } else if (c3651i == C3651i.f19324c) {
                str = "\\Deleted";
            } else if (c3651i == C3651i.f19325d) {
                str = "\\Draft";
            } else if (c3651i == C3651i.f19326e) {
                str = "\\Flagged";
            } else if (c3651i == C3651i.f19327f) {
                str = "\\Recent";
            } else if (c3651i == C3651i.f19328g) {
                str = "\\Seen";
            }
            if (z6) {
                z6 = false;
            } else {
                sb2.append(' ');
            }
            sb2.append(str);
        }
        for (String str2 : c3678j.getUserFlags()) {
            if (z6) {
                z6 = false;
            } else {
                sb2.append(' ');
            }
            sb2.append(str2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void delete(String str) {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("DELETE", argument);
    }

    public void deleteACL(String str, String str2) {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(str2);
        Response[] responseArrCommand = command("DELETEACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    @Override // com.sun.mail.iap.Protocol
    public void disconnect() {
        super.disconnect();
        this.authenticated = false;
    }

    public ListInfo[] doList(String str, String str2, String str3) throws CommandFailedException, BadCommandException, ConnectionException {
        Argument argument = new Argument();
        writeMailboxName(argument, str2);
        writeMailboxName(argument, str3);
        Response[] responseArrCommand = command(str, argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ListInfo[] listInfoArr = null;
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList(1);
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals(str)) {
                        arrayList.add(new ListInfo(iMAPResponse));
                        responseArrCommand[i10] = null;
                    }
                }
            }
            if (arrayList.size() > 0) {
                listInfoArr = (ListInfo[]) arrayList.toArray(new ListInfo[arrayList.size()]);
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return listInfoArr;
    }

    public void enable(String str) {
        if (!hasCapability("ENABLE")) {
            throw new BadCommandException("ENABLE not supported");
        }
        Argument argument = new Argument();
        argument.writeAtom(str);
        simpleCommand("ENABLE", argument);
        if (this.enabled == null) {
            this.enabled = new HashSet();
        }
        this.enabled.add(str.toUpperCase(Locale.ENGLISH));
        this.utf8 = isEnabled("UTF8=ACCEPT");
    }

    public MailboxInfo examine(String str) {
        return examine(str, null);
    }

    public void expunge() throws CommandFailedException, BadCommandException, ConnectionException {
        simpleCommand("EXPUNGE", null);
    }

    public Response[] fetch(MessageSet[] messageSetArr, String str) {
        return fetch(MessageSet.toString(messageSetArr), str, false);
    }

    public BODY fetchBody(int i10, String str) {
        return fetchBody(i10, str, false);
    }

    public BODYSTRUCTURE fetchBodyStructure(int i10) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, "BODYSTRUCTURE");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (BODYSTRUCTURE) FetchResponse.getItem(responseArrFetch, i10, BODYSTRUCTURE.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public C3678j fetchFlags(int i10) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, "FLAGS");
        int length = responseArrFetch.length;
        int i11 = 0;
        C3678j c3678j = null;
        while (true) {
            if (i11 < length) {
                Response response = responseArrFetch[i11];
                if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == i10 && (c3678j = (C3678j) ((FetchResponse) responseArrFetch[i11]).getItem(FLAGS.class)) != null) {
                    responseArrFetch[i11] = null;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        notifyResponseHandlers(responseArrFetch);
        handleResult(responseArrFetch[responseArrFetch.length - 1]);
        return c3678j;
    }

    public MODSEQ fetchMODSEQ(int i10) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, "MODSEQ");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (MODSEQ) FetchResponse.getItem(responseArrFetch, i10, MODSEQ.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public RFC822DATA fetchRFC822(int i10, String str) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, str == null ? "RFC822" : "RFC822.".concat(str));
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (RFC822DATA) FetchResponse.getItem(responseArrFetch, i10, RFC822DATA.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public BODY fetchSectionBody(int i10, String str, String str2) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, str2);
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (!response.isOK()) {
            if (response.isNO()) {
                return null;
            }
            handleResult(response);
            return null;
        }
        List<BODY> items = FetchResponse.getItems(responseArrFetch, i10, BODY.class);
        if (items.size() == 1) {
            return (BODY) items.get(0);
        }
        if (this.logger.isLoggable(Level.FINEST)) {
            this.logger.finest("got " + items.size() + " BODY responses for section " + str);
        }
        for (BODY body : items) {
            if (this.logger.isLoggable(Level.FINEST)) {
                this.logger.finest("got BODY section " + body.getSection());
            }
            if (body.getSection().equalsIgnoreCase(str)) {
                return body;
            }
        }
        return null;
    }

    public void fetchSequenceNumber(long j6) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(String.valueOf(j6), "UID", true);
        notifyResponseHandlers(responseArrFetch);
        handleResult(responseArrFetch[responseArrFetch.length - 1]);
    }

    public long[] fetchSequenceNumbers(long j6, long j10) throws CommandFailedException, BadCommandException, ConnectionException {
        UID uid;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j6));
        sb2.append(":");
        sb2.append(j10 == -1 ? "*" : String.valueOf(j10));
        Response[] responseArrFetch = fetch(sb2.toString(), "UID", true);
        ArrayList arrayList = new ArrayList();
        for (Response response : responseArrFetch) {
            if (response != null && (response instanceof FetchResponse) && (uid = (UID) ((FetchResponse) response).getItem(UID.class)) != null) {
                arrayList.add(uid);
            }
        }
        notifyResponseHandlers(responseArrFetch);
        handleResult(responseArrFetch[responseArrFetch.length - 1]);
        long[] jArr = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr[i10] = ((UID) arrayList.get(i10)).uid;
        }
        return jArr;
    }

    public UID fetchUID(int i10) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrFetch = fetch(i10, "UID");
        notifyResponseHandlers(responseArrFetch);
        Response response = responseArrFetch[responseArrFetch.length - 1];
        if (response.isOK()) {
            return (UID) FetchResponse.getItem(responseArrFetch, i10, UID.class);
        }
        if (response.isNO()) {
            return null;
        }
        handleResult(response);
        return null;
    }

    public ACL[] getACL(String str) throws CommandFailedException, BadCommandException, ConnectionException {
        String atomString;
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("GETACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ArrayList arrayList = new ArrayList();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("ACL")) {
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString2 = iMAPResponse.readAtomString();
                            if (atomString2 == null || (atomString = iMAPResponse.readAtomString()) == null) {
                                break;
                            }
                            arrayList.add(new ACL(atomString2, new Rights(atomString)));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (ACL[]) arrayList.toArray(new ACL[arrayList.size()]);
    }

    public Map<String, String> getCapabilities() {
        return this.capabilities;
    }

    public CopyUID getCopyUID(Response[] responseArr) {
        byte b10;
        for (int length = responseArr.length - 1; length >= 0; length--) {
            Response response = responseArr[length];
            if (response != null && response.isOK()) {
                do {
                    b10 = response.readByte();
                    if (b10 <= 0) {
                        break;
                    }
                } while (b10 != 91);
                if (b10 != 0 && response.readAtom().equalsIgnoreCase("COPYUID")) {
                    return new CopyUID(response.readLong(), UIDSet.parseUIDSets(response.readAtom()), UIDSet.parseUIDSets(response.readAtom()));
                }
            }
        }
        return null;
    }

    public FetchItem[] getFetchItems() {
        return fetchItems;
    }

    public OutputStream getIMAPOutputStream() {
        return getOutputStream();
    }

    public String getProxyAuthUser() {
        return this.proxyAuthUser;
    }

    public C3694v[] getQuota(String str) throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("QUOTA not supported");
        }
        Argument argument = new Argument();
        argument.writeString(str);
        Response[] responseArrCommand = command("GETQUOTA", argument);
        ArrayList arrayList = new ArrayList();
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("QUOTA")) {
                        arrayList.add(parseQuota(iMAPResponse));
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (C3694v[]) arrayList.toArray(new C3694v[arrayList.size()]);
    }

    public C3694v[] getQuotaRoot(String str) throws CommandFailedException, BadCommandException, ConnectionException, ParsingException {
        C3689u[] c3689uArr;
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("GETQUOTAROOT not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("GETQUOTAROOT", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        HashMap map = new HashMap();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("QUOTAROOT")) {
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString = iMAPResponse.readAtomString();
                            if (atomString == null || atomString.length() <= 0) {
                                break;
                            }
                            map.put(atomString, new C3694v(atomString));
                        }
                        responseArrCommand[i10] = null;
                    } else if (iMAPResponse.keyEquals("QUOTA")) {
                        C3694v quota = parseQuota(iMAPResponse);
                        C3694v c3694v = (C3694v) map.get(quota.f19428a);
                        if (c3694v != null && (c3689uArr = c3694v.f19429b) != null) {
                            C3689u[] c3689uArr2 = new C3689u[c3689uArr.length + quota.f19429b.length];
                            System.arraycopy(c3689uArr, 0, c3689uArr2, 0, c3689uArr.length);
                            C3689u[] c3689uArr3 = quota.f19429b;
                            System.arraycopy(c3689uArr3, 0, c3689uArr2, c3694v.f19429b.length, c3689uArr3.length);
                            quota.f19429b = c3689uArr2;
                        }
                        map.put(quota.f19428a, quota);
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (C3694v[]) map.values().toArray(new C3694v[map.size()]);
    }

    @Override // com.sun.mail.iap.Protocol
    public ByteArray getResponseBuffer() {
        ByteArray byteArray = this.f43922ba;
        this.f43922ba = null;
        return byteArray;
    }

    public SearchSequence getSearchSequence() {
        if (this.searchSequence == null) {
            this.searchSequence = new SearchSequence(this);
        }
        return this.searchSequence;
    }

    public void handleCapabilityResponse(Response[] responseArr) {
        boolean z6 = true;
        for (Response response : responseArr) {
            if (response instanceof IMAPResponse) {
                IMAPResponse iMAPResponse = (IMAPResponse) response;
                if (iMAPResponse.keyEquals("CAPABILITY")) {
                    if (z6) {
                        this.capabilities = new HashMap(10);
                        this.authmechs = new ArrayList(5);
                        z6 = false;
                    }
                    parseCapabilities(iMAPResponse);
                }
            }
        }
    }

    public void handleLoginResult(Response response) throws CommandFailedException, BadCommandException, IMAPReferralException, ConnectionException {
        if (hasCapability("LOGIN-REFERRALS") && (!response.isOK() || this.referralException)) {
            checkReferral(response);
        }
        handleResult(response);
    }

    public boolean hasCapability(String str) {
        if (!str.endsWith("*")) {
            return this.capabilities.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        String upperCase = str.substring(0, str.length() - 1).toUpperCase(Locale.ENGLISH);
        Iterator<String> it = this.capabilities.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(upperCase)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void id(String str) {
        HashMap map = new HashMap();
        map.put("GUID", str);
        id(map);
    }

    public void idleAbort() {
        OutputStream outputStream = getOutputStream();
        try {
            outputStream.write(DONE);
            outputStream.flush();
        } catch (Exception e2) {
            this.logger.log(Level.FINEST, "Exception aborting IDLE", (Throwable) e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0027 -> B:19:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void idleStart() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "IDLE"
            boolean r0 = r5.hasCapability(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L6b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            java.lang.String r2 = "IDLE"
            r3 = 0
            java.lang.String r2 = r5.writeCommand(r2, r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c com.sun.mail.iap.LiteralException -> L1e
            r5.idleTag = r2     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c com.sun.mail.iap.LiteralException -> L1e
            r2 = 0
            goto L31
        L1a:
            r0 = move-exception
            goto L73
        L1c:
            r2 = move-exception
            goto L20
        L1e:
            r2 = move-exception
            goto L29
        L20:
            com.sun.mail.iap.Response r2 = com.sun.mail.iap.Response.byeResponse(r2)     // Catch: java.lang.Throwable -> L1a
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
        L27:
            r2 = r1
            goto L31
        L29:
            com.sun.mail.iap.Response r2 = r2.getResponse()     // Catch: java.lang.Throwable -> L1a
            r0.add(r2)     // Catch: java.lang.Throwable -> L1a
            goto L27
        L31:
            if (r2 != 0) goto L4d
            com.sun.mail.iap.Response r3 = r5.readResponse()     // Catch: java.lang.Throwable -> L1a com.sun.mail.iap.ProtocolException -> L31 java.io.IOException -> L38
            goto L3d
        L38:
            r3 = move-exception
            com.sun.mail.iap.Response r3 = com.sun.mail.iap.Response.byeResponse(r3)     // Catch: java.lang.Throwable -> L1a
        L3d:
            r0.add(r3)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r3.isContinuation()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L27
            boolean r3 = r3.isBYE()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L31
            goto L27
        L4d:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L1a
            com.sun.mail.iap.Response[] r2 = new com.sun.mail.iap.Response[r2]     // Catch: java.lang.Throwable -> L1a
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch: java.lang.Throwable -> L1a
            com.sun.mail.iap.Response[] r0 = (com.sun.mail.iap.Response[]) r0     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 - r1
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L1a
            r5.notifyResponseHandlers(r0)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.isContinuation()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L69
            r5.handleResult(r1)     // Catch: java.lang.Throwable -> L1a
        L69:
            monitor-exit(r5)
            return
        L6b:
            com.sun.mail.iap.BadCommandException r0 = new com.sun.mail.iap.BadCommandException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "IDLE not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L73:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.imap.protocol.IMAPProtocol.idleStart():void");
    }

    public boolean isAuthenticated() {
        return this.authenticated;
    }

    public boolean isEnabled(String str) {
        Set<String> set = this.enabled;
        if (set == null) {
            return false;
        }
        return set.contains(str.toUpperCase(Locale.ENGLISH));
    }

    public boolean isREV1() {
        return this.rev1;
    }

    public ListInfo[] list(String str, String str2) {
        return doList("LIST", str, str2);
    }

    public Rights[] listRights(String str, String str2) throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(str2);
        Response[] responseArrCommand = command("LISTRIGHTS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        ArrayList arrayList = new ArrayList();
        if (response.isOK()) {
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("LISTRIGHTS")) {
                        iMAPResponse.readAtomString();
                        iMAPResponse.readAtomString();
                        while (true) {
                            String atomString = iMAPResponse.readAtomString();
                            if (atomString == null) {
                                break;
                            }
                            arrayList.add(new Rights(atomString));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return (Rights[]) arrayList.toArray(new Rights[arrayList.size()]);
    }

    public void login(String str, String str2) {
        Argument argument = new Argument();
        argument.writeString(str);
        argument.writeString(str2);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("LOGIN command trace suppressed");
                suspendTracing();
            }
            Response[] responseArrCommand = command("LOGIN", argument);
            resumeTracing();
            handleCapabilityResponse(responseArrCommand);
            notifyResponseHandlers(responseArrCommand);
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("LOGIN command result: " + responseArrCommand[responseArrCommand.length - 1]);
            }
            handleLoginResult(responseArrCommand[responseArrCommand.length - 1]);
            setCapabilities(responseArrCommand[responseArrCommand.length - 1]);
            this.authenticated = true;
        } catch (Throwable th2) {
            resumeTracing();
            throw th2;
        }
    }

    public void logout() {
        try {
            Response[] responseArrCommand = command("LOGOUT", null);
            this.authenticated = false;
            notifyResponseHandlers(responseArrCommand);
        } finally {
            disconnect();
        }
    }

    public ListInfo[] lsub(String str, String str2) {
        return doList("LSUB", str, str2);
    }

    public void move(MessageSet[] messageSetArr, String str) throws CommandFailedException, BadCommandException, ConnectionException {
        moveuid(MessageSet.toString(messageSetArr), str, false);
    }

    public CopyUID moveuid(MessageSet[] messageSetArr, String str) {
        return moveuid(MessageSet.toString(messageSetArr), str, true);
    }

    public Rights myRights(String str) throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Response[] responseArrCommand = command("MYRIGHTS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        Rights rights = null;
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Rights rights2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("MYRIGHTS")) {
                        iMAPResponse.readAtomString();
                        String atomString = iMAPResponse.readAtomString();
                        if (rights2 == null) {
                            rights2 = new Rights(atomString);
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            rights = rights2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return rights;
    }

    public Namespaces namespace() throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("NAMESPACE")) {
            throw new BadCommandException("NAMESPACE not supported");
        }
        Namespaces namespaces = null;
        Response[] responseArrCommand = command("NAMESPACE", null);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Namespaces namespaces2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("NAMESPACE")) {
                        if (namespaces2 == null) {
                            namespaces2 = new Namespaces(iMAPResponse);
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            namespaces = namespaces2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return namespaces;
    }

    public void noop() {
        this.logger.fine("IMAPProtocol noop");
        simpleCommand("NOOP", null);
    }

    public void parseCapabilities(Response response) {
        while (true) {
            String atom = response.readAtom();
            if (atom == null) {
                return;
            }
            if (atom.length() != 0) {
                this.capabilities.put(atom.toUpperCase(Locale.ENGLISH), atom);
                if (atom.regionMatches(true, 0, "AUTH=", 0, 5)) {
                    this.authmechs.add(atom.substring(5));
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("AUTH: " + atom.substring(5));
                    }
                }
            } else if (response.peekByte() == 93) {
                return;
            } else {
                response.skipToken();
            }
        }
    }

    public BODY peekBody(int i10, String str) {
        return fetchBody(i10, str, true);
    }

    @Override // com.sun.mail.iap.Protocol
    public void processGreeting(Response response) throws IMAPReferralException, ConnectionException {
        if (response.isBYE()) {
            checkReferral(response);
            throw new ConnectionException(this, response);
        }
        if (!response.isOK()) {
            if (!((IMAPResponse) response).keyEquals("PREAUTH")) {
                disconnect();
                throw new ConnectionException(this, response);
            }
            this.authenticated = true;
            setCapabilities(response);
            return;
        }
        boolean booleanProperty = PropUtil.getBooleanProperty(this.props, this.prefix + ".referralexception", false);
        this.referralException = booleanProperty;
        if (booleanProperty) {
            checkReferral(response);
        }
        setCapabilities(response);
    }

    public boolean processIdleResponse(Response response) throws CommandFailedException, BadCommandException, ConnectionException {
        notifyResponseHandlers(new Response[]{response});
        boolean zIsBYE = response.isBYE();
        if (response.isTagged() && response.getTag().equals(this.idleTag)) {
            zIsBYE = true;
        }
        if (zIsBYE) {
            this.idleTag = null;
        }
        handleResult(response);
        return !zIsBYE;
    }

    public void proxyauth(String str) {
        Argument argument = new Argument();
        argument.writeString(str);
        simpleCommand("PROXYAUTH", argument);
        this.proxyAuthUser = str;
    }

    public synchronized Response readIdleResponse() {
        Response responseByeResponse;
        if (this.idleTag == null) {
            return null;
        }
        try {
            responseByeResponse = readResponse();
        } catch (ProtocolException e2) {
            responseByeResponse = Response.byeResponse(e2);
        } catch (IOException e10) {
            responseByeResponse = Response.byeResponse(e10);
        }
        return responseByeResponse;
    }

    @Override // com.sun.mail.iap.Protocol
    public Response readResponse() {
        IMAPResponse iMAPResponse = new IMAPResponse(this);
        return iMAPResponse.keyEquals("FETCH") ? new FetchResponse(iMAPResponse, getFetchItems()) : iMAPResponse;
    }

    public void rename(String str, String str2) {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        writeMailboxName(argument, str2);
        simpleCommand("RENAME", argument);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public void sasllogin(String[] strArr, String str, String str2, String str3, String str4) {
        ?? arrayList;
        Properties properties = this.props;
        StringBuilder sb2 = new StringBuilder("mail.");
        sb2.append(this.name);
        sb2.append(".sasl.usecanonicalhostname");
        String canonicalHostName = PropUtil.getBooleanProperty(properties, sb2.toString(), false) ? getInetAddress().getCanonicalHostName() : this.host;
        if (this.saslAuthenticator == null) {
            try {
                int i10 = IMAPSaslAuthenticator.f7246a;
                this.saslAuthenticator = (SaslAuthenticator) IMAPSaslAuthenticator.class.getConstructor(IMAPProtocol.class, String.class, Properties.class, MailLogger.class, String.class).newInstance(this, this.name, this.props, this.logger, canonicalHostName);
            } catch (Exception e2) {
                this.logger.log(Level.FINE, "Can't load SASL authenticator", (Throwable) e2);
                return;
            }
        }
        if (strArr == null || strArr.length <= 0) {
            arrayList = this.authmechs;
        } else {
            arrayList = new ArrayList(strArr.length);
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (this.authmechs.contains(strArr[i11])) {
                    arrayList.add(strArr[i11]);
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("SASL authentication command trace suppressed");
                suspendTracing();
            }
            if (this.saslAuthenticator.authenticate(strArr2, str, str2, str3, str4)) {
                if (this.noauthdebug && isTracing()) {
                    this.logger.fine("SASL authentication succeeded");
                }
                this.authenticated = true;
            } else if (this.noauthdebug && isTracing()) {
                this.logger.fine("SASL authentication failed");
            }
            resumeTracing();
        } catch (Throwable th2) {
            resumeTracing();
            throw th2;
        }
    }

    public int[] search(MessageSet[] messageSetArr, AbstractC5767j abstractC5767j) {
        return search(MessageSet.toString(messageSetArr), abstractC5767j);
    }

    public MailboxInfo select(String str) {
        return select(str, null);
    }

    public void setACL(String str, char c2, ACL acl) {
        if (!hasCapability("ACL")) {
            throw new BadCommandException("ACL not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        argument.writeString(acl.getName());
        String string = acl.getRights().toString();
        if (c2 == '+' || c2 == '-') {
            string = c2 + string;
        }
        argument.writeString(string);
        Response[] responseArrCommand = command("SETACL", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    public void setCapabilities(Response response) {
        byte b10;
        do {
            b10 = response.readByte();
            if (b10 <= 0) {
                break;
            }
        } while (b10 != 91);
        if (b10 != 0 && response.readAtom().equalsIgnoreCase("CAPABILITY")) {
            this.capabilities = new HashMap(10);
            this.authmechs = new ArrayList(5);
            parseCapabilities(response);
        }
    }

    public void setQuota(C3694v c3694v) {
        if (!hasCapability("QUOTA")) {
            throw new BadCommandException("QUOTA not supported");
        }
        Argument argument = new Argument();
        argument.writeString(c3694v.f19428a);
        Argument argument2 = new Argument();
        if (c3694v.f19429b != null) {
            int i10 = 0;
            while (true) {
                C3689u[] c3689uArr = c3694v.f19429b;
                if (i10 >= c3689uArr.length) {
                    break;
                }
                argument2.writeAtom(c3689uArr[i10].f19420a);
                argument2.writeNumber(c3694v.f19429b[i10].f19421b);
                i10++;
            }
        }
        argument.writeArgument(argument2);
        Response[] responseArrCommand = command("SETQUOTA", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
    }

    public int[] sort(SortTerm[] sortTermArr, AbstractC5767j abstractC5767j) throws CommandFailedException, BadCommandException, SearchException, ConnectionException {
        if (!hasCapability("SORT*")) {
            throw new BadCommandException("SORT not supported");
        }
        if (sortTermArr == null || sortTermArr.length == 0) {
            throw new BadCommandException("Must have at least one sort term");
        }
        Argument argument = new Argument();
        Argument argument2 = new Argument();
        for (SortTerm sortTerm : sortTermArr) {
            argument2.writeAtom(sortTerm.toString());
        }
        argument.writeArgument(argument2);
        argument.writeAtom("UTF-8");
        if (abstractC5767j != null) {
            try {
                argument.append(getSearchSequence().generateSequence(abstractC5767j, "UTF-8"));
            } catch (IOException e2) {
                throw new SearchException(e2.toString());
            }
        } else {
            argument.writeAtom("ALL");
        }
        Response[] responseArrCommand = command("SORT", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        int[] iArr = null;
        if (response.isOK()) {
            ArrayList arrayList = new ArrayList();
            int length = responseArrCommand.length;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("SORT")) {
                        while (true) {
                            int number = iMAPResponse.readNumber();
                            if (number == -1) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(number));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return iArr;
    }

    public void startTLS() {
        try {
            super.startTLS("STARTTLS");
        } catch (ProtocolException e2) {
            this.logger.log(Level.FINE, "STARTTLS ProtocolException", (Throwable) e2);
            throw e2;
        } catch (Exception e10) {
            this.logger.log(Level.FINE, "STARTTLS Exception", (Throwable) e10);
            notifyResponseHandlers(new Response[]{Response.byeResponse(e10)});
            disconnect();
            throw new ProtocolException("STARTTLS failure", e10);
        }
    }

    public Status status(String str, String[] strArr) throws CommandFailedException, BadCommandException, ConnectionException {
        if (!isREV1() && !hasCapability("IMAP4SUNVERSION")) {
            throw new BadCommandException("STATUS not supported");
        }
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        Argument argument2 = new Argument();
        if (strArr == null) {
            strArr = Status.standardItems;
        }
        for (String str2 : strArr) {
            argument2.writeAtom(str2);
        }
        argument.writeArgument(argument2);
        Response[] responseArrCommand = command("STATUS", argument);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        Status status = null;
        if (response.isOK()) {
            int length = responseArrCommand.length;
            Status status2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                Response response2 = responseArrCommand[i10];
                if (response2 instanceof IMAPResponse) {
                    IMAPResponse iMAPResponse = (IMAPResponse) response2;
                    if (iMAPResponse.keyEquals("STATUS")) {
                        if (status2 == null) {
                            status2 = new Status(iMAPResponse);
                        } else {
                            Status.add(status2, new Status(iMAPResponse));
                        }
                        responseArrCommand[i10] = null;
                    }
                }
            }
            status = status2;
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(response);
        return status;
    }

    public void storeFlags(MessageSet[] messageSetArr, C3678j c3678j, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        storeFlags(MessageSet.toString(messageSetArr), c3678j, z6);
    }

    public void subscribe(String str) {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("SUBSCRIBE", argument);
    }

    @Override // com.sun.mail.iap.Protocol
    public boolean supportsNonSyncLiterals() {
        return hasCapability("LITERAL+");
    }

    @Override // com.sun.mail.iap.Protocol
    public boolean supportsUtf8() {
        return this.utf8;
    }

    public void uidexpunge(UIDSet[] uIDSetArr) throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("UIDPLUS")) {
            throw new BadCommandException("UID EXPUNGE not supported");
        }
        simpleCommand("UID EXPUNGE " + UIDSet.toString(uIDSetArr), null);
    }

    public int[] uidfetchChangedSince(long j6, long j10, long j11) throws CommandFailedException, BadCommandException, ConnectionException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j6));
        sb2.append(":");
        sb2.append(j10 == -1 ? "*" : String.valueOf(j10));
        StringBuilder sbM7383p = m0.m7383p("UID FETCH ", sb2.toString(), " (FLAGS) (CHANGEDSINCE ");
        sbM7383p.append(String.valueOf(j11));
        sbM7383p.append(")");
        Response[] responseArrCommand = command(sbM7383p.toString(), null);
        ArrayList arrayList = new ArrayList();
        for (Response response : responseArrCommand) {
            if (response != null && (response instanceof FetchResponse)) {
                arrayList.add(Integer.valueOf(((FetchResponse) response).getNumber()));
            }
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr;
    }

    public void unauthenticate() throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("X-UNAUTHENTICATE")) {
            throw new BadCommandException("UNAUTHENTICATE not supported");
        }
        simpleCommand("UNAUTHENTICATE", null);
        this.authenticated = false;
    }

    public void unselect() throws CommandFailedException, BadCommandException, ConnectionException {
        if (!hasCapability("UNSELECT")) {
            throw new BadCommandException("UNSELECT not supported");
        }
        simpleCommand("UNSELECT", null);
    }

    public void unsubscribe(String str) {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        simpleCommand("UNSUBSCRIBE", argument);
    }

    public void writeMailboxName(Argument argument, String str) {
        if (this.utf8) {
            argument.writeString(str, StandardCharsets.UTF_8);
        } else {
            argument.writeString(BASE64MailboxEncoder.encode(str));
        }
    }

    public AppendUID appenduid(String str, C3678j c3678j, Date date, Literal literal, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (c3678j != null) {
            C3651i c3651i = C3651i.f19327f;
            if (c3678j.contains(c3651i)) {
                C3678j c3678j2 = new C3678j(c3678j);
                c3678j2.remove(c3651i);
                c3678j = c3678j2;
            }
            argument.writeAtom(createFlagList(c3678j));
        }
        if (date != null) {
            argument.writeString(INTERNALDATE.format(date));
        }
        argument.writeBytes(literal);
        Response[] responseArrCommand = command("APPEND", argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        if (z6) {
            return getAppendUID(responseArrCommand[responseArrCommand.length - 1]);
        }
        return null;
    }

    public void copy(int i10, int i11, String str) throws CommandFailedException, BadCommandException, ConnectionException {
        copyuid(String.valueOf(i10) + ":" + String.valueOf(i11), str, false);
    }

    public CopyUID copyuid(int i10, int i11, String str) {
        return copyuid(String.valueOf(i10) + ":" + String.valueOf(i11), str, true);
    }

    public MailboxInfo examine(String str, ResyncData resyncData) throws CommandFailedException, BadCommandException, ConnectionException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (resyncData != null) {
            if (resyncData == ResyncData.CONDSTORE) {
                if (!hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                argument.writeArgument(new Argument().writeAtom("CONDSTORE"));
            } else {
                if (!hasCapability("QRESYNC")) {
                    throw new BadCommandException("QRESYNC not supported");
                }
                argument.writeArgument(resyncArgs(resyncData));
            }
        }
        Response[] responseArrCommand = command("EXAMINE", argument);
        MailboxInfo mailboxInfo = new MailboxInfo(responseArrCommand);
        mailboxInfo.mode = 1;
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        return mailboxInfo;
    }

    public Response[] fetch(int i10, int i11, String str) {
        return fetch(String.valueOf(i10) + ":" + String.valueOf(i11), str, false);
    }

    public BODY fetchBody(int i10, String str, boolean z6) {
        if (str == null) {
            str = "";
        }
        return fetchSectionBody(i10, str, a1.m14335o(new StringBuilder(), z6 ? "BODY.PEEK[" : "BODY[", str, "]"));
    }

    public void move(int i10, int i11, String str) throws CommandFailedException, BadCommandException, ConnectionException {
        moveuid(String.valueOf(i10) + ":" + String.valueOf(i11), str, false);
    }

    public CopyUID moveuid(int i10, int i11, String str) {
        return moveuid(String.valueOf(i10) + ":" + String.valueOf(i11), str, true);
    }

    public BODY peekBody(int i10, String str, int i11, int i12) {
        return fetchBody(i10, str, i11, i12, true, null);
    }

    public int[] search(AbstractC5767j abstractC5767j) {
        return search("ALL", abstractC5767j);
    }

    public MailboxInfo select(String str, ResyncData resyncData) throws CommandFailedException, BadCommandException, ConnectionException {
        Argument argument = new Argument();
        writeMailboxName(argument, str);
        if (resyncData != null) {
            if (resyncData == ResyncData.CONDSTORE) {
                if (!hasCapability("CONDSTORE")) {
                    throw new BadCommandException("CONDSTORE not supported");
                }
                argument.writeArgument(new Argument().writeAtom("CONDSTORE"));
            } else {
                if (!hasCapability("QRESYNC")) {
                    throw new BadCommandException("QRESYNC not supported");
                }
                argument.writeArgument(resyncArgs(resyncData));
            }
        }
        Response[] responseArrCommand = command("SELECT", argument);
        MailboxInfo mailboxInfo = new MailboxInfo(responseArrCommand);
        notifyResponseHandlers(responseArrCommand);
        Response response = responseArrCommand[responseArrCommand.length - 1];
        if (response.isOK()) {
            if (response.toString().indexOf("READ-ONLY") != -1) {
                mailboxInfo.mode = 1;
            } else {
                mailboxInfo.mode = 2;
            }
        }
        handleResult(response);
        return mailboxInfo;
    }

    public void storeFlags(int i10, int i11, C3678j c3678j, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        storeFlags(String.valueOf(i10) + ":" + String.valueOf(i11), c3678j, z6);
    }

    private CopyUID copyuid(String str, String str2, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        if (z6 && !hasCapability("UIDPLUS")) {
            throw new BadCommandException("UIDPLUS not supported");
        }
        Argument argument = new Argument();
        argument.writeAtom(str);
        writeMailboxName(argument, str2);
        Response[] responseArrCommand = command("COPY", argument);
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
        if (z6) {
            return getCopyUID(responseArrCommand);
        }
        return null;
    }

    private CopyUID moveuid(String str, String str2, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        if (hasCapability("MOVE")) {
            if (z6 && !hasCapability("UIDPLUS")) {
                throw new BadCommandException("UIDPLUS not supported");
            }
            Argument argument = new Argument();
            argument.writeAtom(str);
            writeMailboxName(argument, str2);
            Response[] responseArrCommand = command("MOVE", argument);
            notifyResponseHandlers(responseArrCommand);
            handleResult(responseArrCommand[responseArrCommand.length - 1]);
            if (z6) {
                return getCopyUID(responseArrCommand);
            }
            return null;
        }
        throw new BadCommandException("MOVE not supported");
    }

    private int[] search(String str, AbstractC5767j abstractC5767j) throws ProtocolException, SearchException {
        if (supportsUtf8() || SearchSequence.isAscii(abstractC5767j)) {
            try {
                return issueSearch(str, abstractC5767j, null);
            } catch (IOException unused) {
            }
        }
        int i10 = 0;
        while (true) {
            String[] strArr = this.searchCharsets;
            if (i10 < strArr.length) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    try {
                        return issueSearch(str, abstractC5767j, str2);
                    } catch (CommandFailedException unused2) {
                        this.searchCharsets[i10] = null;
                    } catch (ProtocolException e2) {
                        throw e2;
                    } catch (SearchException e10) {
                        throw e10;
                    } catch (IOException unused3) {
                        continue;
                    }
                }
                i10++;
            } else {
                throw new SearchException("Search failed");
            }
        }
    }

    public Response[] fetch(int i10, String str) {
        return fetch(String.valueOf(i10), str, false);
    }

    public BODY peekBody(int i10, String str, int i11, int i12, ByteArray byteArray) {
        return fetchBody(i10, str, i11, i12, true, byteArray);
    }

    public void storeFlags(int i10, C3678j c3678j, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        storeFlags(String.valueOf(i10), c3678j, z6);
    }

    private Response[] fetch(String str, String str2, boolean z6) {
        if (z6) {
            return command(a1.m14333m("UID FETCH ", str, " (", str2, ")"), null);
        }
        return command(a1.m14333m("FETCH ", str, " (", str2, ")"), null);
    }

    private void storeFlags(String str, C3678j c3678j, boolean z6) throws CommandFailedException, BadCommandException, ConnectionException {
        Response[] responseArrCommand;
        if (z6) {
            StringBuilder sbM7383p = m0.m7383p("STORE ", str, " +FLAGS ");
            sbM7383p.append(createFlagList(c3678j));
            responseArrCommand = command(sbM7383p.toString(), null);
        } else {
            StringBuilder sbM7383p2 = m0.m7383p("STORE ", str, " -FLAGS ");
            sbM7383p2.append(createFlagList(c3678j));
            responseArrCommand = command(sbM7383p2.toString(), null);
        }
        notifyResponseHandlers(responseArrCommand);
        handleResult(responseArrCommand[responseArrCommand.length - 1]);
    }

    public Map<String, String> id(Map<String, String> map) {
        ID id2;
        if (hasCapability("ID")) {
            Response[] responseArrCommand = command("ID", ID.getArgumentList(map));
            Response response = responseArrCommand[responseArrCommand.length - 1];
            if (response.isOK()) {
                int length = responseArrCommand.length;
                id2 = null;
                for (int i10 = 0; i10 < length; i10++) {
                    Response response2 = responseArrCommand[i10];
                    if (response2 instanceof IMAPResponse) {
                        IMAPResponse iMAPResponse = (IMAPResponse) response2;
                        if (iMAPResponse.keyEquals("ID")) {
                            if (id2 == null) {
                                id2 = new ID(iMAPResponse);
                            }
                            responseArrCommand[i10] = null;
                        }
                    }
                }
            } else {
                id2 = null;
            }
            notifyResponseHandlers(responseArrCommand);
            handleResult(response);
            if (id2 == null) {
                return null;
            }
            return id2.getServerParams();
        }
        throw new BadCommandException("ID not supported");
    }

    public BODY fetchBody(int i10, String str, int i11, int i12) {
        return fetchBody(i10, str, i11, i12, false, null);
    }

    public BODY fetchBody(int i10, String str, int i11, int i12, ByteArray byteArray) {
        return fetchBody(i10, str, i11, i12, false, byteArray);
    }

    public BODY fetchBody(int i10, String str, int i11, int i12, boolean z6, ByteArray byteArray) {
        this.f43922ba = byteArray;
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z6 ? "BODY.PEEK[" : "BODY[");
        sb2.append(str);
        sb2.append("]<");
        sb2.append(String.valueOf(i11));
        sb2.append(".");
        sb2.append(String.valueOf(i12));
        sb2.append(">");
        return fetchSectionBody(i10, str, sb2.toString());
    }

    public void fetchSequenceNumbers(long[] jArr) throws CommandFailedException, BadCommandException, ConnectionException {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(String.valueOf(jArr[i10]));
        }
        Response[] responseArrFetch = fetch(sb2.toString(), "UID", true);
        notifyResponseHandlers(responseArrFetch);
        handleResult(responseArrFetch[responseArrFetch.length - 1]);
    }

    public IMAPProtocol(InputStream inputStream, PrintStream printStream, Properties properties, boolean z6) {
        super(inputStream, printStream, properties, z6);
        this.connected = false;
        this.rev1 = false;
        this.noauthdebug = true;
        this.name = "imap";
        this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        if (this.capabilities == null) {
            this.capabilities = new HashMap();
        }
        this.searchCharsets = new String[]{"UTF-8", AbstractC3670s.m8252p(AbstractC3670s.m8246j())};
        this.connected = true;
    }
}
