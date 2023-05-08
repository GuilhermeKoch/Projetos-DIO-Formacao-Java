public class ParametrosInvalidosException extends Exception{
static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois){
        throw new ParametrosInvalidosException();
        }
    }
}