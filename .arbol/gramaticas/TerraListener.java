// Generated from gramaticas/Terra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TerraParser}.
 */
public interface TerraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TerraParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TerraParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TerraParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(TerraParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(TerraParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(TerraParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(TerraParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(TerraParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(TerraParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(TerraParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(TerraParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#expresion_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_stmt(TerraParser.Expresion_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#expresion_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_stmt(TerraParser.Expresion_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#mostrar_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMostrar_stmt(TerraParser.Mostrar_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#mostrar_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMostrar_stmt(TerraParser.Mostrar_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#si_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSi_stmt(TerraParser.Si_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#si_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSi_stmt(TerraParser.Si_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#mientras_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMientras_stmt(TerraParser.Mientras_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#mientras_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMientras_stmt(TerraParser.Mientras_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#para_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPara_stmt(TerraParser.Para_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#para_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPara_stmt(TerraParser.Para_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#funcion_decl}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_decl(TerraParser.Funcion_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#funcion_decl}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_decl(TerraParser.Funcion_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#retornar_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRetornar_stmt(TerraParser.Retornar_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#retornar_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRetornar_stmt(TerraParser.Retornar_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#guardar_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGuardar_stmt(TerraParser.Guardar_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#guardar_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGuardar_stmt(TerraParser.Guardar_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#graficar_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGraficar_stmt(TerraParser.Graficar_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#graficar_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGraficar_stmt(TerraParser.Graficar_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#tipo_grafica}.
	 * @param ctx the parse tree
	 */
	void enterTipo_grafica(TerraParser.Tipo_graficaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#tipo_grafica}.
	 * @param ctx the parse tree
	 */
	void exitTipo_grafica(TerraParser.Tipo_graficaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#opcion_grafica}.
	 * @param ctx the parse tree
	 */
	void enterOpcion_grafica(TerraParser.Opcion_graficaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#opcion_grafica}.
	 * @param ctx the parse tree
	 */
	void exitOpcion_grafica(TerraParser.Opcion_graficaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TerraParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TerraParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#tuberia}.
	 * @param ctx the parse tree
	 */
	void enterTuberia(TerraParser.TuberiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#tuberia}.
	 * @param ctx the parse tree
	 */
	void exitTuberia(TerraParser.TuberiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TerraParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TerraParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(TerraParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(TerraParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#agregacion}.
	 * @param ctx the parse tree
	 */
	void enterAgregacion(TerraParser.AgregacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#agregacion}.
	 * @param ctx the parse tree
	 */
	void exitAgregacion(TerraParser.AgregacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#lista_columnas}.
	 * @param ctx the parse tree
	 */
	void enterLista_columnas(TerraParser.Lista_columnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#lista_columnas}.
	 * @param ctx the parse tree
	 */
	void exitLista_columnas(TerraParser.Lista_columnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(TerraParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(TerraParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#o_logico}.
	 * @param ctx the parse tree
	 */
	void enterO_logico(TerraParser.O_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#o_logico}.
	 * @param ctx the parse tree
	 */
	void exitO_logico(TerraParser.O_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#y_logico}.
	 * @param ctx the parse tree
	 */
	void enterY_logico(TerraParser.Y_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#y_logico}.
	 * @param ctx the parse tree
	 */
	void exitY_logico(TerraParser.Y_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(TerraParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(TerraParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(TerraParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(TerraParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#pertenencia}.
	 * @param ctx the parse tree
	 */
	void enterPertenencia(TerraParser.PertenenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#pertenencia}.
	 * @param ctx the parse tree
	 */
	void exitPertenencia(TerraParser.PertenenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(TerraParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(TerraParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(TerraParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(TerraParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(TerraParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(TerraParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#unario}.
	 * @param ctx the parse tree
	 */
	void enterUnario(TerraParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#unario}.
	 * @param ctx the parse tree
	 */
	void exitUnario(TerraParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#postfijo}.
	 * @param ctx the parse tree
	 */
	void enterPostfijo(TerraParser.PostfijoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#postfijo}.
	 * @param ctx the parse tree
	 */
	void exitPostfijo(TerraParser.PostfijoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#primario}.
	 * @param ctx the parse tree
	 */
	void enterPrimario(TerraParser.PrimarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#primario}.
	 * @param ctx the parse tree
	 */
	void exitPrimario(TerraParser.PrimarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#carga}.
	 * @param ctx the parse tree
	 */
	void enterCarga(TerraParser.CargaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#carga}.
	 * @param ctx the parse tree
	 */
	void exitCarga(TerraParser.CargaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#opcion_carga}.
	 * @param ctx the parse tree
	 */
	void enterOpcion_carga(TerraParser.Opcion_cargaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#opcion_carga}.
	 * @param ctx the parse tree
	 */
	void exitOpcion_carga(TerraParser.Opcion_cargaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(TerraParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(TerraParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerraParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(TerraParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerraParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(TerraParser.ListaContext ctx);
}