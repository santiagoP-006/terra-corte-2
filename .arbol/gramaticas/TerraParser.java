// Generated from gramaticas/Terra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TerraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FIJO=17, 
		VAR=18, SI=19, SINO=20, FIN=21, MIENTRAS=22, PARA=23, EN=24, MOSTRAR=25, 
		FUNCION=26, RETORNAR=27, CARGAR=28, GUARDAR=29, COMO=30, CON=31, ENCABEZADO=32, 
		SEPARADOR=33, SELECCIONAR=34, FILTRAR=35, DONDE=36, CREAR=37, RENOMBRAR=38, 
		ORDENAR=39, POR=40, ASC=41, DESC=42, ELIMINAR=43, DUPLICADOS=44, NULOS=45, 
		RELLENAR=46, CONVERTIR=47, AGRUPAR=48, RESUMIR=49, LIMITAR=50, GRAFICAR=51, 
		BARRAS=52, LINEAS=53, HISTOGRAMA=54, DISPERSION=55, CAJA=56, EJE_X=57, 
		EJE_Y=58, TITULO=59, LEYENDA=60, T_NUMERO=61, T_DECIMAL=62, T_TEXTO=63, 
		T_BOOLEANO=64, BOOLEANO=65, NULO=66, FLECHA=67, AND=68, OR=69, IGUAL=70, 
		DIFERENTE=71, MAYOR_IGUAL=72, MENOR_IGUAL=73, DECIMAL=74, NUMERO=75, TEXTO=76, 
		IDENTIFICADOR=77, NL=78, WS=79, COMENTARIO_LINEA=80, COMENTARIO_BLOQUE=81;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_bloque = 2, RULE_declaracion_variable = 3, 
		RULE_asignacion = 4, RULE_expresion_stmt = 5, RULE_mostrar_stmt = 6, RULE_si_stmt = 7, 
		RULE_mientras_stmt = 8, RULE_para_stmt = 9, RULE_funcion_decl = 10, RULE_retornar_stmt = 11, 
		RULE_guardar_stmt = 12, RULE_graficar_stmt = 13, RULE_tipo_grafica = 14, 
		RULE_opcion_grafica = 15, RULE_expresion = 16, RULE_tuberia = 17, RULE_expr = 18, 
		RULE_operacion = 19, RULE_agregacion = 20, RULE_lista_columnas = 21, RULE_tipo_dato = 22, 
		RULE_o_logico = 23, RULE_y_logico = 24, RULE_igualdad = 25, RULE_relacional = 26, 
		RULE_pertenencia = 27, RULE_suma = 28, RULE_termino = 29, RULE_potencia = 30, 
		RULE_unario = 31, RULE_postfijo = 32, RULE_primario = 33, RULE_carga = 34, 
		RULE_opcion_carga = 35, RULE_llamada = 36, RULE_lista = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "bloque", "declaracion_variable", "asignacion", 
			"expresion_stmt", "mostrar_stmt", "si_stmt", "mientras_stmt", "para_stmt", 
			"funcion_decl", "retornar_stmt", "guardar_stmt", "graficar_stmt", "tipo_grafica", 
			"opcion_grafica", "expresion", "tuberia", "expr", "operacion", "agregacion", 
			"lista_columnas", "tipo_dato", "o_logico", "y_logico", "igualdad", "relacional", 
			"pertenencia", "suma", "termino", "potencia", "unario", "postfijo", "primario", 
			"carga", "opcion_carga", "llamada", "lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "','", "')'", "':'", "'['", "']'", "'>'", "'<'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'fijo'", "'var'", "'si'", 
			"'sino'", "'fin'", "'mientras'", "'para'", "'en'", "'mostrar'", "'funcion'", 
			"'retornar'", "'cargar'", "'guardar'", "'como'", "'con'", "'encabezado'", 
			"'separador'", "'seleccionar'", "'filtrar'", "'donde'", "'crear'", "'renombrar'", 
			"'ordenar'", "'por'", "'asc'", "'desc'", "'eliminar'", "'duplicados'", 
			"'nulos'", "'rellenar'", "'convertir'", "'agrupar'", "'resumir'", "'limitar'", 
			"'graficar'", "'barras'", "'lineas'", "'histograma'", "'dispersion'", 
			"'caja'", "'eje_x'", "'eje_y'", "'titulo'", "'leyenda'", "'numero'", 
			"'decimal'", "'texto'", "'booleano'", null, "'nulo'", "'|>'", "'&&'", 
			"'||'", "'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "FIJO", "VAR", "SI", "SINO", "FIN", "MIENTRAS", 
			"PARA", "EN", "MOSTRAR", "FUNCION", "RETORNAR", "CARGAR", "GUARDAR", 
			"COMO", "CON", "ENCABEZADO", "SEPARADOR", "SELECCIONAR", "FILTRAR", "DONDE", 
			"CREAR", "RENOMBRAR", "ORDENAR", "POR", "ASC", "DESC", "ELIMINAR", "DUPLICADOS", 
			"NULOS", "RELLENAR", "CONVERTIR", "AGRUPAR", "RESUMIR", "LIMITAR", "GRAFICAR", 
			"BARRAS", "LINEAS", "HISTOGRAMA", "DISPERSION", "CAJA", "EJE_X", "EJE_Y", 
			"TITULO", "LEYENDA", "T_NUMERO", "T_DECIMAL", "T_TEXTO", "T_BOOLEANO", 
			"BOOLEANO", "NULO", "FLECHA", "AND", "OR", "IGUAL", "DIFERENTE", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "DECIMAL", "NUMERO", "TEXTO", "IDENTIFICADOR", "NL", "WS", 
			"COMENTARIO_LINEA", "COMENTARIO_BLOQUE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Terra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TerraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TerraParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800867440708L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 15875L) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NL:
					{
					setState(76);
					match(NL);
					}
					break;
				case T__1:
				case T__5:
				case T__10:
				case T__15:
				case FIJO:
				case VAR:
				case SI:
				case MIENTRAS:
				case PARA:
				case MOSTRAR:
				case FUNCION:
				case RETORNAR:
				case CARGAR:
				case GUARDAR:
				case GRAFICAR:
				case BOOLEANO:
				case NULO:
				case DECIMAL:
				case NUMERO:
				case TEXTO:
				case IDENTIFICADOR:
					{
					setState(77);
					sentencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Mostrar_stmtContext mostrar_stmt() {
			return getRuleContext(Mostrar_stmtContext.class,0);
		}
		public Si_stmtContext si_stmt() {
			return getRuleContext(Si_stmtContext.class,0);
		}
		public Mientras_stmtContext mientras_stmt() {
			return getRuleContext(Mientras_stmtContext.class,0);
		}
		public Para_stmtContext para_stmt() {
			return getRuleContext(Para_stmtContext.class,0);
		}
		public Guardar_stmtContext guardar_stmt() {
			return getRuleContext(Guardar_stmtContext.class,0);
		}
		public Graficar_stmtContext graficar_stmt() {
			return getRuleContext(Graficar_stmtContext.class,0);
		}
		public Expresion_stmtContext expresion_stmt() {
			return getRuleContext(Expresion_stmtContext.class,0);
		}
		public Funcion_declContext funcion_decl() {
			return getRuleContext(Funcion_declContext.class,0);
		}
		public Retornar_stmtContext retornar_stmt() {
			return getRuleContext(Retornar_stmtContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaracion_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				mostrar_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				si_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				mientras_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				para_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				guardar_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				graficar_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				expresion_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				funcion_decl();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				retornar_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251800867440708L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 15875L) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NL:
					{
					setState(98);
					match(NL);
					}
					break;
				case T__1:
				case T__5:
				case T__10:
				case T__15:
				case FIJO:
				case VAR:
				case SI:
				case MIENTRAS:
				case PARA:
				case MOSTRAR:
				case FUNCION:
				case RETORNAR:
				case CARGAR:
				case GUARDAR:
				case GRAFICAR:
				case BOOLEANO:
				case NULO:
				case DECIMAL:
				case NUMERO:
				case TEXTO:
				case IDENTIFICADOR:
					{
					setState(99);
					sentencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variableContext extends ParserRuleContext {
		public TerminalNode FIJO() { return getToken(TerraParser.FIJO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public TerminalNode VAR() { return getToken(TerraParser.VAR, 0); }
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterDeclaracion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitDeclaracion_variable(this);
		}
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_variable);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIJO:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(FIJO);
				setState(106);
				match(IDENTIFICADOR);
				setState(107);
				match(T__0);
				setState(108);
				expresion();
				setState(109);
				match(NL);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(VAR);
				setState(112);
				match(IDENTIFICADOR);
				setState(113);
				match(T__0);
				setState(114);
				expresion();
				setState(115);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFICADOR);
			setState(120);
			match(T__0);
			setState(121);
			expresion();
			setState(122);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_stmtContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public Expresion_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterExpresion_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitExpresion_stmt(this);
		}
	}

	public final Expresion_stmtContext expresion_stmt() throws RecognitionException {
		Expresion_stmtContext _localctx = new Expresion_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expresion();
			setState(125);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mostrar_stmtContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(TerraParser.MOSTRAR, 0); }
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Mostrar_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterMostrar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitMostrar_stmt(this);
		}
	}

	public final Mostrar_stmtContext mostrar_stmt() throws RecognitionException {
		Mostrar_stmtContext _localctx = new Mostrar_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mostrar_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(MOSTRAR);
			setState(128);
			match(T__1);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268503108L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7683L) != 0)) {
				{
				setState(129);
				expresion();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(130);
					match(T__2);
					setState(131);
					expresion();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(T__3);
			setState(140);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Si_stmtContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(TerraParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(TerraParser.SI, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN() { return getToken(TerraParser.FIN, 0); }
		public List<TerminalNode> SINO() { return getTokens(TerraParser.SINO); }
		public TerminalNode SINO(int i) {
			return getToken(TerraParser.SINO, i);
		}
		public Si_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterSi_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitSi_stmt(this);
		}
	}

	public final Si_stmtContext si_stmt() throws RecognitionException {
		Si_stmtContext _localctx = new Si_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_si_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SI);
			setState(143);
			expresion();
			setState(144);
			match(T__4);
			setState(145);
			match(NL);
			setState(146);
			bloque();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(SINO);
					setState(148);
					match(SI);
					setState(149);
					expresion();
					setState(150);
					match(T__4);
					setState(151);
					match(NL);
					setState(152);
					bloque();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(159);
				match(SINO);
				setState(160);
				match(T__4);
				setState(161);
				match(NL);
				setState(162);
				bloque();
				}
			}

			setState(165);
			match(FIN);
			setState(166);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mientras_stmtContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(TerraParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(TerraParser.FIN, 0); }
		public Mientras_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterMientras_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitMientras_stmt(this);
		}
	}

	public final Mientras_stmtContext mientras_stmt() throws RecognitionException {
		Mientras_stmtContext _localctx = new Mientras_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mientras_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(MIENTRAS);
			setState(169);
			expresion();
			setState(170);
			match(T__4);
			setState(171);
			match(NL);
			setState(172);
			bloque();
			setState(173);
			match(FIN);
			setState(174);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Para_stmtContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(TerraParser.PARA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public TerminalNode EN() { return getToken(TerraParser.EN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(TerraParser.FIN, 0); }
		public Para_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPara_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPara_stmt(this);
		}
	}

	public final Para_stmtContext para_stmt() throws RecognitionException {
		Para_stmtContext _localctx = new Para_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_para_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PARA);
			setState(177);
			match(IDENTIFICADOR);
			setState(178);
			match(EN);
			setState(179);
			expresion();
			setState(180);
			match(T__4);
			setState(181);
			match(NL);
			setState(182);
			bloque();
			setState(183);
			match(FIN);
			setState(184);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_declContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(TerraParser.FUNCION, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(TerraParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(TerraParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN() { return getToken(TerraParser.FIN, 0); }
		public Funcion_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterFuncion_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitFuncion_decl(this);
		}
	}

	public final Funcion_declContext funcion_decl() throws RecognitionException {
		Funcion_declContext _localctx = new Funcion_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcion_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FUNCION);
			setState(187);
			match(IDENTIFICADOR);
			setState(188);
			match(T__1);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(189);
				match(IDENTIFICADOR);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(190);
					match(T__2);
					setState(191);
					match(IDENTIFICADOR);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(199);
			match(T__3);
			setState(200);
			match(T__4);
			setState(201);
			match(NL);
			setState(202);
			bloque();
			setState(203);
			match(FIN);
			setState(204);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Retornar_stmtContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(TerraParser.RETORNAR, 0); }
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Retornar_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterRetornar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitRetornar_stmt(this);
		}
	}

	public final Retornar_stmtContext retornar_stmt() throws RecognitionException {
		Retornar_stmtContext _localctx = new Retornar_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_retornar_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(RETORNAR);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268503108L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7683L) != 0)) {
				{
				setState(207);
				expresion();
				}
			}

			setState(210);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Guardar_stmtContext extends ParserRuleContext {
		public TerminalNode GUARDAR() { return getToken(TerraParser.GUARDAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMO() { return getToken(TerraParser.COMO, 0); }
		public TerminalNode NL() { return getToken(TerraParser.NL, 0); }
		public Guardar_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardar_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterGuardar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitGuardar_stmt(this);
		}
	}

	public final Guardar_stmtContext guardar_stmt() throws RecognitionException {
		Guardar_stmtContext _localctx = new Guardar_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guardar_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(GUARDAR);
			setState(213);
			expr();
			setState(214);
			match(COMO);
			setState(215);
			expr();
			setState(216);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Graficar_stmtContext extends ParserRuleContext {
		public TerminalNode GRAFICAR() { return getToken(TerraParser.GRAFICAR, 0); }
		public Tipo_graficaContext tipo_grafica() {
			return getRuleContext(Tipo_graficaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public List<Opcion_graficaContext> opcion_grafica() {
			return getRuleContexts(Opcion_graficaContext.class);
		}
		public Opcion_graficaContext opcion_grafica(int i) {
			return getRuleContext(Opcion_graficaContext.class,i);
		}
		public Graficar_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graficar_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterGraficar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitGraficar_stmt(this);
		}
	}

	public final Graficar_stmtContext graficar_stmt() throws RecognitionException {
		Graficar_stmtContext _localctx = new Graficar_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_graficar_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(GRAFICAR);
			setState(219);
			tipo_grafica();
			setState(220);
			expr();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(221);
						match(NL);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(227);
					opcion_grafica();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(233);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_graficaContext extends ParserRuleContext {
		public TerminalNode BARRAS() { return getToken(TerraParser.BARRAS, 0); }
		public TerminalNode LINEAS() { return getToken(TerraParser.LINEAS, 0); }
		public TerminalNode HISTOGRAMA() { return getToken(TerraParser.HISTOGRAMA, 0); }
		public TerminalNode DISPERSION() { return getToken(TerraParser.DISPERSION, 0); }
		public TerminalNode CAJA() { return getToken(TerraParser.CAJA, 0); }
		public Tipo_graficaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_grafica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterTipo_grafica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitTipo_grafica(this);
		}
	}

	public final Tipo_graficaContext tipo_grafica() throws RecognitionException {
		Tipo_graficaContext _localctx = new Tipo_graficaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_grafica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opcion_graficaContext extends ParserRuleContext {
		public TerminalNode EJE_X() { return getToken(TerraParser.EJE_X, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public TerminalNode EJE_Y() { return getToken(TerraParser.EJE_Y, 0); }
		public TerminalNode TITULO() { return getToken(TerraParser.TITULO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEYENDA() { return getToken(TerraParser.LEYENDA, 0); }
		public TerminalNode GUARDAR() { return getToken(TerraParser.GUARDAR, 0); }
		public TerminalNode COMO() { return getToken(TerraParser.COMO, 0); }
		public Opcion_graficaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_grafica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterOpcion_grafica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitOpcion_grafica(this);
		}
	}

	public final Opcion_graficaContext opcion_grafica() throws RecognitionException {
		Opcion_graficaContext _localctx = new Opcion_graficaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opcion_grafica);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EJE_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(EJE_X);
				setState(238);
				match(IDENTIFICADOR);
				}
				break;
			case EJE_Y:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(EJE_Y);
				setState(240);
				match(IDENTIFICADOR);
				}
				break;
			case TITULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(TITULO);
				setState(242);
				expr();
				}
				break;
			case LEYENDA:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(LEYENDA);
				setState(244);
				expr();
				}
				break;
			case GUARDAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(GUARDAR);
				setState(246);
				match(COMO);
				setState(247);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TuberiaContext tuberia() {
			return getRuleContext(TuberiaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			tuberia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TuberiaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> FLECHA() { return getTokens(TerraParser.FLECHA); }
		public TerminalNode FLECHA(int i) {
			return getToken(TerraParser.FLECHA, i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public TuberiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuberia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterTuberia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitTuberia(this);
		}
	}

	public final TuberiaContext tuberia() throws RecognitionException {
		TuberiaContext _localctx = new TuberiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tuberia);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expr();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(253);
						match(NL);
						}
						}
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(259);
					match(FLECHA);
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(260);
						match(NL);
						}
						}
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(266);
					operacion();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public O_logicoContext o_logico() {
			return getRuleContext(O_logicoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			o_logico();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(TerraParser.SELECCIONAR, 0); }
		public Lista_columnasContext lista_columnas() {
			return getRuleContext(Lista_columnasContext.class,0);
		}
		public TerminalNode FILTRAR() { return getToken(TerraParser.FILTRAR, 0); }
		public TerminalNode DONDE() { return getToken(TerraParser.DONDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CREAR() { return getToken(TerraParser.CREAR, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(TerraParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(TerraParser.IDENTIFICADOR, i);
		}
		public TerminalNode RENOMBRAR() { return getToken(TerraParser.RENOMBRAR, 0); }
		public TerminalNode COMO() { return getToken(TerraParser.COMO, 0); }
		public TerminalNode ORDENAR() { return getToken(TerraParser.ORDENAR, 0); }
		public TerminalNode POR() { return getToken(TerraParser.POR, 0); }
		public TerminalNode ASC() { return getToken(TerraParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TerraParser.DESC, 0); }
		public TerminalNode ELIMINAR() { return getToken(TerraParser.ELIMINAR, 0); }
		public TerminalNode DUPLICADOS() { return getToken(TerraParser.DUPLICADOS, 0); }
		public TerminalNode NULOS() { return getToken(TerraParser.NULOS, 0); }
		public TerminalNode EN() { return getToken(TerraParser.EN, 0); }
		public TerminalNode RELLENAR() { return getToken(TerraParser.RELLENAR, 0); }
		public TerminalNode CON() { return getToken(TerraParser.CON, 0); }
		public TerminalNode CONVERTIR() { return getToken(TerraParser.CONVERTIR, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode AGRUPAR() { return getToken(TerraParser.AGRUPAR, 0); }
		public TerminalNode RESUMIR() { return getToken(TerraParser.RESUMIR, 0); }
		public List<AgregacionContext> agregacion() {
			return getRuleContexts(AgregacionContext.class);
		}
		public AgregacionContext agregacion(int i) {
			return getRuleContext(AgregacionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(TerraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(TerraParser.NL, i);
		}
		public TerminalNode LIMITAR() { return getToken(TerraParser.LIMITAR, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operacion);
		int _la;
		try {
			int _alt;
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(SELECCIONAR);
				setState(275);
				lista_columnas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(FILTRAR);
				setState(277);
				match(DONDE);
				setState(278);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(CREAR);
				setState(280);
				match(IDENTIFICADOR);
				setState(281);
				match(T__0);
				setState(282);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(RENOMBRAR);
				setState(284);
				match(IDENTIFICADOR);
				setState(285);
				match(COMO);
				setState(286);
				match(IDENTIFICADOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(ORDENAR);
				setState(288);
				match(POR);
				setState(289);
				match(IDENTIFICADOR);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(290);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				match(ELIMINAR);
				setState(294);
				match(DUPLICADOS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				match(ELIMINAR);
				setState(296);
				match(NULOS);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EN) {
					{
					setState(297);
					match(EN);
					setState(298);
					lista_columnas();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(301);
				match(RELLENAR);
				setState(302);
				match(NULOS);
				setState(303);
				match(EN);
				setState(304);
				match(IDENTIFICADOR);
				setState(305);
				match(CON);
				setState(306);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				match(CONVERTIR);
				setState(308);
				match(IDENTIFICADOR);
				setState(309);
				match(COMO);
				setState(310);
				tipo_dato();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(311);
				match(AGRUPAR);
				setState(312);
				match(POR);
				setState(313);
				lista_columnas();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
				match(RESUMIR);
				setState(315);
				agregacion();
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						match(T__2);
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(317);
							match(NL);
							}
							}
							setState(322);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(323);
						agregacion();
						}
						} 
					}
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(329);
				match(LIMITAR);
				setState(330);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgregacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AgregacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agregacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterAgregacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitAgregacion(this);
		}
	}

	public final AgregacionContext agregacion() throws RecognitionException {
		AgregacionContext _localctx = new AgregacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_agregacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(IDENTIFICADOR);
			setState(334);
			match(T__0);
			setState(335);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_columnasContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(TerraParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(TerraParser.IDENTIFICADOR, i);
		}
		public Lista_columnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_columnas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterLista_columnas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitLista_columnas(this);
		}
	}

	public final Lista_columnasContext lista_columnas() throws RecognitionException {
		Lista_columnasContext _localctx = new Lista_columnasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lista_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__5);
			setState(338);
			match(IDENTIFICADOR);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(339);
				match(T__2);
				setState(340);
				match(IDENTIFICADOR);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode T_NUMERO() { return getToken(TerraParser.T_NUMERO, 0); }
		public TerminalNode T_DECIMAL() { return getToken(TerraParser.T_DECIMAL, 0); }
		public TerminalNode T_TEXTO() { return getToken(TerraParser.T_TEXTO, 0); }
		public TerminalNode T_BOOLEANO() { return getToken(TerraParser.T_BOOLEANO, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class O_logicoContext extends ParserRuleContext {
		public List<Y_logicoContext> y_logico() {
			return getRuleContexts(Y_logicoContext.class);
		}
		public Y_logicoContext y_logico(int i) {
			return getRuleContext(Y_logicoContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TerraParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TerraParser.OR, i);
		}
		public O_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterO_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitO_logico(this);
		}
	}

	public final O_logicoContext o_logico() throws RecognitionException {
		O_logicoContext _localctx = new O_logicoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_o_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			y_logico();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					match(OR);
					setState(352);
					y_logico();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Y_logicoContext extends ParserRuleContext {
		public List<IgualdadContext> igualdad() {
			return getRuleContexts(IgualdadContext.class);
		}
		public IgualdadContext igualdad(int i) {
			return getRuleContext(IgualdadContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TerraParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TerraParser.AND, i);
		}
		public Y_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterY_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitY_logico(this);
		}
	}

	public final Y_logicoContext y_logico() throws RecognitionException {
		Y_logicoContext _localctx = new Y_logicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_y_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			igualdad();
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(AND);
					setState(360);
					igualdad();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadContext extends ParserRuleContext {
		public List<RelacionalContext> relacional() {
			return getRuleContexts(RelacionalContext.class);
		}
		public RelacionalContext relacional(int i) {
			return getRuleContext(RelacionalContext.class,i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(TerraParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(TerraParser.IGUAL, i);
		}
		public List<TerminalNode> DIFERENTE() { return getTokens(TerraParser.DIFERENTE); }
		public TerminalNode DIFERENTE(int i) {
			return getToken(TerraParser.DIFERENTE, i);
		}
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitIgualdad(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		IgualdadContext _localctx = new IgualdadContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_igualdad);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			relacional();
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					_la = _input.LA(1);
					if ( !(_la==IGUAL || _la==DIFERENTE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(368);
					relacional();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalContext extends ParserRuleContext {
		public List<PertenenciaContext> pertenencia() {
			return getRuleContexts(PertenenciaContext.class);
		}
		public PertenenciaContext pertenencia(int i) {
			return getRuleContext(PertenenciaContext.class,i);
		}
		public List<TerminalNode> MAYOR_IGUAL() { return getTokens(TerraParser.MAYOR_IGUAL); }
		public TerminalNode MAYOR_IGUAL(int i) {
			return getToken(TerraParser.MAYOR_IGUAL, i);
		}
		public List<TerminalNode> MENOR_IGUAL() { return getTokens(TerraParser.MENOR_IGUAL); }
		public TerminalNode MENOR_IGUAL(int i) {
			return getToken(TerraParser.MENOR_IGUAL, i);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitRelacional(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relacional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			pertenencia();
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8 || _la==MAYOR_IGUAL || _la==MENOR_IGUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(376);
					pertenencia();
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PertenenciaContext extends ParserRuleContext {
		public List<SumaContext> suma() {
			return getRuleContexts(SumaContext.class);
		}
		public SumaContext suma(int i) {
			return getRuleContext(SumaContext.class,i);
		}
		public TerminalNode EN() { return getToken(TerraParser.EN, 0); }
		public PertenenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pertenencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPertenencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPertenencia(this);
		}
	}

	public final PertenenciaContext pertenencia() throws RecognitionException {
		PertenenciaContext _localctx = new PertenenciaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pertenencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			suma();
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(383);
				match(EN);
				setState(384);
				suma();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_suma);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			termino();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(389);
					termino();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<PotenciaContext> potencia() {
			return getRuleContexts(PotenciaContext.class);
		}
		public PotenciaContext potencia(int i) {
			return getRuleContext(PotenciaContext.class,i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_termino);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			potencia();
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(397);
					potencia();
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PotenciaContext extends ParserRuleContext {
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			unario();
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(404);
				match(T__14);
				setState(405);
				potencia();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends ParserRuleContext {
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public PostfijoContext postfijo() {
			return getRuleContext(PostfijoContext.class,0);
		}
		public UnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitUnario(this);
		}
	}

	public final UnarioContext unario() throws RecognitionException {
		UnarioContext _localctx = new UnarioContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unario);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(T__10);
				setState(409);
				unario();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(T__15);
				setState(411);
				unario();
				}
				break;
			case T__1:
			case T__5:
			case CARGAR:
			case BOOLEANO:
			case NULO:
			case DECIMAL:
			case NUMERO:
			case TEXTO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				postfijo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfijoContext extends ParserRuleContext {
		public PrimarioContext primario() {
			return getRuleContext(PrimarioContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PostfijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPostfijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPostfijo(this);
		}
	}

	public final PostfijoContext postfijo() throws RecognitionException {
		PostfijoContext _localctx = new PostfijoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_postfijo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			primario();
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					match(T__5);
					setState(417);
					expr();
					setState(418);
					match(T__6);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarioContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(TerraParser.NUMERO, 0); }
		public TerminalNode DECIMAL() { return getToken(TerraParser.DECIMAL, 0); }
		public TerminalNode TEXTO() { return getToken(TerraParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(TerraParser.BOOLEANO, 0); }
		public TerminalNode NULO() { return getToken(TerraParser.NULO, 0); }
		public CargaContext carga() {
			return getRuleContext(CargaContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PrimarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterPrimario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitPrimario(this);
		}
	}

	public final PrimarioContext primario() throws RecognitionException {
		PrimarioContext _localctx = new PrimarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primario);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(DECIMAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(TEXTO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(BOOLEANO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				carga();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				llamada();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				match(IDENTIFICADOR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				lista();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
				match(T__1);
				setState(435);
				expresion();
				setState(436);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CargaContext extends ParserRuleContext {
		public TerminalNode CARGAR() { return getToken(TerraParser.CARGAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CON() { return getTokens(TerraParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(TerraParser.CON, i);
		}
		public List<Opcion_cargaContext> opcion_carga() {
			return getRuleContexts(Opcion_cargaContext.class);
		}
		public Opcion_cargaContext opcion_carga(int i) {
			return getRuleContext(Opcion_cargaContext.class,i);
		}
		public CargaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterCarga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitCarga(this);
		}
	}

	public final CargaContext carga() throws RecognitionException {
		CargaContext _localctx = new CargaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_carga);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(CARGAR);
			setState(441);
			expr();
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(CON);
					setState(443);
					opcion_carga();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opcion_cargaContext extends ParserRuleContext {
		public TerminalNode SEPARADOR() { return getToken(TerraParser.SEPARADOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCABEZADO() { return getToken(TerraParser.ENCABEZADO, 0); }
		public Opcion_cargaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_carga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterOpcion_carga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitOpcion_carga(this);
		}
	}

	public final Opcion_cargaContext opcion_carga() throws RecognitionException {
		Opcion_cargaContext _localctx = new Opcion_cargaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opcion_carga);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(SEPARADOR);
				setState(450);
				expr();
				}
				break;
			case ENCABEZADO:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(ENCABEZADO);
				setState(452);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(TerraParser.IDENTIFICADOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitLlamada(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(IDENTIFICADOR);
			setState(456);
			match(T__1);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268503108L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7683L) != 0)) {
				{
				setState(457);
				expr();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(458);
					match(T__2);
					setState(459);
					expr();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(467);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerraListener ) ((TerraListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__5);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268503108L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7683L) != 0)) {
				{
				setState(470);
				expr();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(471);
					match(T__2);
					setState(472);
					expr();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(480);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001Q\u01e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0005\u0000"+
		"O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003v\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0085\b\u0006\n\u0006"+
		"\f\u0006\u0088\t\u0006\u0003\u0006\u008a\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u009b\b\u0007\n\u0007\f\u0007\u009e\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a4\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00c1\b\n\n\n\f\n\u00c4\t\n\u0003\n\u00c6\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d1\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00df"+
		"\b\r\n\r\f\r\u00e2\t\r\u0001\r\u0005\r\u00e5\b\r\n\r\f\r\u00e8\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f9\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00ff\b\u0011\n\u0011\f\u0011\u0102"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0106\b\u0011\n\u0011\f\u0011"+
		"\u0109\t\u0011\u0001\u0011\u0005\u0011\u010c\b\u0011\n\u0011\f\u0011\u010f"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0124\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012c\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u013f"+
		"\b\u0013\n\u0013\f\u0013\u0142\t\u0013\u0001\u0013\u0005\u0013\u0145\b"+
		"\u0013\n\u0013\f\u0013\u0148\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u014c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0156\b\u0015\n\u0015"+
		"\f\u0015\u0159\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0162\b\u0017\n\u0017"+
		"\f\u0017\u0165\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u016a\b\u0018\n\u0018\f\u0018\u016d\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0172\b\u0019\n\u0019\f\u0019\u0175\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u017a\b\u001a\n\u001a\f\u001a\u017d"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0182\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0187\b\u001c\n\u001c"+
		"\f\u001c\u018a\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u018f\b\u001d\n\u001d\f\u001d\u0192\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0197\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u019e\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01a5\b \n \f \u01a8\t \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01b7"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01bd\b\"\n\"\f\"\u01c0\t"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01c6\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u01cd\b$\n$\f$\u01d0\t$\u0003$\u01d2\b$\u0001$\u0001$"+
		"\u0001%\u0001%\u0001%\u0001%\u0005%\u01da\b%\n%\f%\u01dd\t%\u0003%\u01df"+
		"\b%\u0001%\u0001%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJ\u0000\u0007\u0001\u000048\u0001\u0000)*\u0001\u0000=@\u0001\u0000F"+
		"G\u0002\u0000\b\tHI\u0001\u0000\n\u000b\u0001\u0000\f\u000e\u0205\u0000"+
		"P\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004f\u0001"+
		"\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000"+
		"\u0000\n|\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e"+
		"\u008e\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012"+
		"\u00b0\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016"+
		"\u00ce\u0001\u0000\u0000\u0000\u0018\u00d4\u0001\u0000\u0000\u0000\u001a"+
		"\u00da\u0001\u0000\u0000\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e"+
		"\u00f8\u0001\u0000\u0000\u0000 \u00fa\u0001\u0000\u0000\u0000\"\u00fc"+
		"\u0001\u0000\u0000\u0000$\u0110\u0001\u0000\u0000\u0000&\u014b\u0001\u0000"+
		"\u0000\u0000(\u014d\u0001\u0000\u0000\u0000*\u0151\u0001\u0000\u0000\u0000"+
		",\u015c\u0001\u0000\u0000\u0000.\u015e\u0001\u0000\u0000\u00000\u0166"+
		"\u0001\u0000\u0000\u00002\u016e\u0001\u0000\u0000\u00004\u0176\u0001\u0000"+
		"\u0000\u00006\u017e\u0001\u0000\u0000\u00008\u0183\u0001\u0000\u0000\u0000"+
		":\u018b\u0001\u0000\u0000\u0000<\u0193\u0001\u0000\u0000\u0000>\u019d"+
		"\u0001\u0000\u0000\u0000@\u019f\u0001\u0000\u0000\u0000B\u01b6\u0001\u0000"+
		"\u0000\u0000D\u01b8\u0001\u0000\u0000\u0000F\u01c5\u0001\u0000\u0000\u0000"+
		"H\u01c7\u0001\u0000\u0000\u0000J\u01d5\u0001\u0000\u0000\u0000LO\u0005"+
		"N\u0000\u0000MO\u0003\u0002\u0001\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0000\u0000\u0001T\u0001\u0001\u0000\u0000\u0000Ua\u0003"+
		"\u0006\u0003\u0000Va\u0003\b\u0004\u0000Wa\u0003\f\u0006\u0000Xa\u0003"+
		"\u000e\u0007\u0000Ya\u0003\u0010\b\u0000Za\u0003\u0012\t\u0000[a\u0003"+
		"\u0018\f\u0000\\a\u0003\u001a\r\u0000]a\u0003\n\u0005\u0000^a\u0003\u0014"+
		"\n\u0000_a\u0003\u0016\u000b\u0000`U\u0001\u0000\u0000\u0000`V\u0001\u0000"+
		"\u0000\u0000`W\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`Y\u0001"+
		"\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000"+
		"`\\\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\u0003\u0001\u0000\u0000\u0000be\u0005"+
		"N\u0000\u0000ce\u0003\u0002\u0001\u0000db\u0001\u0000\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000g\u0005\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0011\u0000\u0000jk\u0005M\u0000\u0000kl\u0005\u0001"+
		"\u0000\u0000lm\u0003 \u0010\u0000mn\u0005N\u0000\u0000nv\u0001\u0000\u0000"+
		"\u0000op\u0005\u0012\u0000\u0000pq\u0005M\u0000\u0000qr\u0005\u0001\u0000"+
		"\u0000rs\u0003 \u0010\u0000st\u0005N\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"ui\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000v\u0007\u0001\u0000"+
		"\u0000\u0000wx\u0005M\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0003 \u0010"+
		"\u0000z{\u0005N\u0000\u0000{\t\u0001\u0000\u0000\u0000|}\u0003 \u0010"+
		"\u0000}~\u0005N\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0019\u0000\u0000\u0080\u0089\u0005\u0002\u0000\u0000\u0081\u0086"+
		"\u0003 \u0010\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0085\u0003"+
		" \u0010\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0004"+
		"\u0000\u0000\u008c\u008d\u0005N\u0000\u0000\u008d\r\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0013\u0000\u0000\u008f\u0090\u0003 \u0010\u0000"+
		"\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u0092\u0005N\u0000\u0000\u0092"+
		"\u009c\u0003\u0004\u0002\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094"+
		"\u0095\u0005\u0013\u0000\u0000\u0095\u0096\u0003 \u0010\u0000\u0096\u0097"+
		"\u0005\u0005\u0000\u0000\u0097\u0098\u0005N\u0000\u0000\u0098\u0099\u0003"+
		"\u0004\u0002\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a3\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u0014\u0000\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a2\u0005"+
		"N\u0000\u0000\u00a2\u00a4\u0003\u0004\u0002\u0000\u00a3\u009f\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0005N\u0000"+
		"\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0016\u0000"+
		"\u0000\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u00ab\u0005\u0005\u0000\u0000"+
		"\u00ab\u00ac\u0005N\u0000\u0000\u00ac\u00ad\u0003\u0004\u0002\u0000\u00ad"+
		"\u00ae\u0005\u0015\u0000\u0000\u00ae\u00af\u0005N\u0000\u0000\u00af\u0011"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0017\u0000\u0000\u00b1\u00b2"+
		"\u0005M\u0000\u0000\u00b2\u00b3\u0005\u0018\u0000\u0000\u00b3\u00b4\u0003"+
		" \u0010\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6\u0005N\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0004\u0002\u0000\u00b7\u00b8\u0005\u0015\u0000"+
		"\u0000\u00b8\u00b9\u0005N\u0000\u0000\u00b9\u0013\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u001a\u0000\u0000\u00bb\u00bc\u0005M\u0000\u0000\u00bc"+
		"\u00c5\u0005\u0002\u0000\u0000\u00bd\u00c2\u0005M\u0000\u0000\u00be\u00bf"+
		"\u0005\u0003\u0000\u0000\u00bf\u00c1\u0005M\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0005\u0000\u0000\u00c9\u00ca\u0005N\u0000\u0000\u00ca\u00cb\u0003\u0004"+
		"\u0002\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000\u00cc\u00cd\u0005N\u0000"+
		"\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00d0\u0005\u001b\u0000"+
		"\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005N\u0000\u0000\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005\u001d\u0000\u0000\u00d5\u00d6\u0003$\u0012\u0000\u00d6\u00d7"+
		"\u0005\u001e\u0000\u0000\u00d7\u00d8\u0003$\u0012\u0000\u00d8\u00d9\u0005"+
		"N\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000\u00da\u00db\u00053\u0000"+
		"\u0000\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00e6\u0003$\u0012\u0000"+
		"\u00dd\u00df\u0005N\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u001e\u000f\u0000\u00e4"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005N\u0000\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0007\u0000\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u00059\u0000\u0000\u00ee\u00f9\u0005M\u0000\u0000\u00ef\u00f0\u0005:"+
		"\u0000\u0000\u00f0\u00f9\u0005M\u0000\u0000\u00f1\u00f2\u0005;\u0000\u0000"+
		"\u00f2\u00f9\u0003$\u0012\u0000\u00f3\u00f4\u0005<\u0000\u0000\u00f4\u00f9"+
		"\u0003$\u0012\u0000\u00f5\u00f6\u0005\u001d\u0000\u0000\u00f6\u00f7\u0005"+
		"\u001e\u0000\u0000\u00f7\u00f9\u0003$\u0012\u0000\u00f8\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f8\u00ef\u0001\u0000\u0000\u0000\u00f8\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\"\u0011"+
		"\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc\u010d\u0003$\u0012\u0000\u00fd"+
		"\u00ff\u0005N\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0107\u0005C\u0000\u0000\u0104\u0106\u0005"+
		"N\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0003&\u0013\u0000\u010b\u0100\u0001\u0000\u0000"+
		"\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e#\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0003.\u0017\u0000\u0111"+
		"%\u0001\u0000\u0000\u0000\u0112\u0113\u0005\"\u0000\u0000\u0113\u014c"+
		"\u0003*\u0015\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0116\u0005$"+
		"\u0000\u0000\u0116\u014c\u0003$\u0012\u0000\u0117\u0118\u0005%\u0000\u0000"+
		"\u0118\u0119\u0005M\u0000\u0000\u0119\u011a\u0005\u0001\u0000\u0000\u011a"+
		"\u014c\u0003$\u0012\u0000\u011b\u011c\u0005&\u0000\u0000\u011c\u011d\u0005"+
		"M\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u014c\u0005M\u0000"+
		"\u0000\u011f\u0120\u0005\'\u0000\u0000\u0120\u0121\u0005(\u0000\u0000"+
		"\u0121\u0123\u0005M\u0000\u0000\u0122\u0124\u0007\u0001\u0000\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u014c\u0001\u0000\u0000\u0000\u0125\u0126\u0005+\u0000\u0000\u0126\u014c"+
		"\u0005,\u0000\u0000\u0127\u0128\u0005+\u0000\u0000\u0128\u012b\u0005-"+
		"\u0000\u0000\u0129\u012a\u0005\u0018\u0000\u0000\u012a\u012c\u0003*\u0015"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u014c\u0001\u0000\u0000\u0000\u012d\u012e\u0005.\u0000\u0000"+
		"\u012e\u012f\u0005-\u0000\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130"+
		"\u0131\u0005M\u0000\u0000\u0131\u0132\u0005\u001f\u0000\u0000\u0132\u014c"+
		"\u0003$\u0012\u0000\u0133\u0134\u0005/\u0000\u0000\u0134\u0135\u0005M"+
		"\u0000\u0000\u0135\u0136\u0005\u001e\u0000\u0000\u0136\u014c\u0003,\u0016"+
		"\u0000\u0137\u0138\u00050\u0000\u0000\u0138\u0139\u0005(\u0000\u0000\u0139"+
		"\u014c\u0003*\u0015\u0000\u013a\u013b\u00051\u0000\u0000\u013b\u0146\u0003"+
		"(\u0014\u0000\u013c\u0140\u0005\u0003\u0000\u0000\u013d\u013f\u0005N\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0003(\u0014\u0000\u0144\u013c\u0001\u0000\u0000\u0000"+
		"\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014c\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u00052\u0000\u0000\u014a"+
		"\u014c\u0003$\u0012\u0000\u014b\u0112\u0001\u0000\u0000\u0000\u014b\u0114"+
		"\u0001\u0000\u0000\u0000\u014b\u0117\u0001\u0000\u0000\u0000\u014b\u011b"+
		"\u0001\u0000\u0000\u0000\u014b\u011f\u0001\u0000\u0000\u0000\u014b\u0125"+
		"\u0001\u0000\u0000\u0000\u014b\u0127\u0001\u0000\u0000\u0000\u014b\u012d"+
		"\u0001\u0000\u0000\u0000\u014b\u0133\u0001\u0000\u0000\u0000\u014b\u0137"+
		"\u0001\u0000\u0000\u0000\u014b\u013a\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014c\'\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"M\u0000\u0000\u014e\u014f\u0005\u0001\u0000\u0000\u014f\u0150\u0003$\u0012"+
		"\u0000\u0150)\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0006\u0000\u0000"+
		"\u0152\u0157\u0005M\u0000\u0000\u0153\u0154\u0005\u0003\u0000\u0000\u0154"+
		"\u0156\u0005M\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0007\u0000\u0000\u015b+\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0007\u0002\u0000\u0000\u015d-\u0001\u0000"+
		"\u0000\u0000\u015e\u0163\u00030\u0018\u0000\u015f\u0160\u0005E\u0000\u0000"+
		"\u0160\u0162\u00030\u0018\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164/\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0166\u016b\u00032\u0019\u0000\u0167\u0168\u0005"+
		"D\u0000\u0000\u0168\u016a\u00032\u0019\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c1\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0173\u00034\u001a\u0000\u016f"+
		"\u0170\u0007\u0003\u0000\u0000\u0170\u0172\u00034\u001a\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u01743\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u017b\u0003"+
		"6\u001b\u0000\u0177\u0178\u0007\u0004\u0000\u0000\u0178\u017a\u00036\u001b"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c5\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u0181\u00038\u001c\u0000\u017f\u0180\u0005\u0018\u0000\u0000\u0180"+
		"\u0182\u00038\u001c\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u01827\u0001\u0000\u0000\u0000\u0183\u0188\u0003"+
		":\u001d\u0000\u0184\u0185\u0007\u0005\u0000\u0000\u0185\u0187\u0003:\u001d"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u01899\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u0190\u0003<\u001e\u0000\u018c\u018d\u0007\u0006\u0000\u0000\u018d"+
		"\u018f\u0003<\u001e\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191;\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0193\u0196\u0003>\u001f\u0000\u0194\u0195\u0005\u000f"+
		"\u0000\u0000\u0195\u0197\u0003<\u001e\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197=\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0005\u000b\u0000\u0000\u0199\u019e\u0003>\u001f\u0000\u019a"+
		"\u019b\u0005\u0010\u0000\u0000\u019b\u019e\u0003>\u001f\u0000\u019c\u019e"+
		"\u0003@ \u0000\u019d\u0198\u0001\u0000\u0000\u0000\u019d\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e?\u0001\u0000\u0000"+
		"\u0000\u019f\u01a6\u0003B!\u0000\u01a0\u01a1\u0005\u0006\u0000\u0000\u01a1"+
		"\u01a2\u0003$\u0012\u0000\u01a2\u01a3\u0005\u0007\u0000\u0000\u01a3\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7A\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01b7\u0005K\u0000\u0000\u01aa\u01b7\u0005J\u0000"+
		"\u0000\u01ab\u01b7\u0005L\u0000\u0000\u01ac\u01b7\u0005A\u0000\u0000\u01ad"+
		"\u01b7\u0005B\u0000\u0000\u01ae\u01b7\u0003D\"\u0000\u01af\u01b7\u0003"+
		"H$\u0000\u01b0\u01b7\u0005M\u0000\u0000\u01b1\u01b7\u0003J%\u0000\u01b2"+
		"\u01b3\u0005\u0002\u0000\u0000\u01b3\u01b4\u0003 \u0010\u0000\u01b4\u01b5"+
		"\u0005\u0004\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01a9"+
		"\u0001\u0000\u0000\u0000\u01b6\u01aa\u0001\u0000\u0000\u0000\u01b6\u01ab"+
		"\u0001\u0000\u0000\u0000\u01b6\u01ac\u0001\u0000\u0000\u0000\u01b6\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b6\u01ae\u0001\u0000\u0000\u0000\u01b6\u01af"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b0\u0001\u0000\u0000\u0000\u01b6\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b2\u0001\u0000\u0000\u0000\u01b7C\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0005\u001c\u0000\u0000\u01b9\u01be\u0003"+
		"$\u0012\u0000\u01ba\u01bb\u0005\u001f\u0000\u0000\u01bb\u01bd\u0003F#"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bfE\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0005!\u0000\u0000\u01c2\u01c6\u0003$\u0012\u0000\u01c3\u01c4"+
		"\u0005 \u0000\u0000\u01c4\u01c6\u0003$\u0012\u0000\u01c5\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6G\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005M\u0000\u0000\u01c8\u01d1\u0005\u0002\u0000\u0000"+
		"\u01c9\u01ce\u0003$\u0012\u0000\u01ca\u01cb\u0005\u0003\u0000\u0000\u01cb"+
		"\u01cd\u0003$\u0012\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01d0"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d1\u01c9\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0004\u0000\u0000\u01d4I\u0001\u0000\u0000\u0000\u01d5\u01de\u0005"+
		"\u0006\u0000\u0000\u01d6\u01db\u0003$\u0012\u0000\u01d7\u01d8\u0005\u0003"+
		"\u0000\u0000\u01d8\u01da\u0003$\u0012\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01d6\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0005\u0007\u0000\u0000\u01e1K\u0001\u0000\u0000\u0000"+
		"*NP`dfu\u0086\u0089\u009c\u00a3\u00c2\u00c5\u00d0\u00e0\u00e6\u00f8\u0100"+
		"\u0107\u010d\u0123\u012b\u0140\u0146\u014b\u0157\u0163\u016b\u0173\u017b"+
		"\u0181\u0188\u0190\u0196\u019d\u01a6\u01b6\u01be\u01c5\u01ce\u01d1\u01db"+
		"\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}