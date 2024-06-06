package Artefato4;
import java.util.Scanner;


public class artefato1 {
	private static Scanner entrada = new Scanner(System.in);
	private static int opcaoArea,  opcaoCad,escolhaFinalizar, menu ,senhaUsuario=0, senhaUsuarioConf,dataNascUsuario, escolhaCadastroU, cepUsuario, logSenha;
	private static String saircliente,menuReturn, menuReturnsaircliente = null,  nomeInstituicao, cnpjInstituicao, telInstituicao, emailInstituicao, nomeResponsavelIns, menuRetur, logEmail, cpfUsuario, nomeUsuario, telUsuario,  emailUsuario=null, logradouroUsuario, numEndUsuario, compEndUsuario, bairroUsuario, cidUsuario, estadoUsuario;

	
	public static void main(String[] args) {
		

		//MENU RETURN
		do{
		System.out.println("Menu\nEscolha a opção desejada:\n1.- Cadastro\n2.- Login Cliente\n3.-sair");
		menu=entrada.nextInt();
		limpatela();
			//MENU
			switch(menu){
				//CADASTRO
				case 1:
						System.out.println("_________________ \nCADASTRO\n\nEscolha a modalidade de cadastro que deseja:\n 1.- Cliente\n 2.- Parceiro");
						opcaoCad=entrada.nextInt();
						limpatela();
						switch(opcaoCad)
						{
							//CADASTRO CLIENTE
							case 1:
							   	System.out.println("_________________ \nCADASTRO CLIENTE\n\nPara fazer o cadastro por favor preencha o formulario a seguir: ");
								System.out.print("Nome completo: ");
						        nomeUsuario=entrada.next();
						        System.out.print("CPF (somente números): ");
						        cpfUsuario=entrada.next();
						        System.out.print("Telefone celular: ");
						        telUsuario = entrada.next();
						        System.out.print("Seu melhor E-mail: ");
						        emailUsuario = entrada.next();
						        System.out.print("Data de nascimento (somente números. Ex: 12062005): ");
						        dataNascUsuario = entrada.nextInt();
						        System.out.print("Logradouro: ");
						        logradouroUsuario = entrada.next();
						        System.out.print("Número: ");
						        numEndUsuario = entrada.next();
						        System.out.print("Complemento (opcional): ");
						        compEndUsuario = entrada.next();
						        System.out.print("Bairro: ");
						        bairroUsuario = entrada.next();
						        System.out.print("Cidade: ");
						        cidUsuario = entrada.next();
						        System.out.print("Estado (somente a sigla UF): ");
						        estadoUsuario = entrada.next();
						        System.out.print("CEP (somente números): ");
						        cepUsuario = entrada.nextInt();
						        
						        do {
						        System.out.print("Crie uma senha contendo 6 digitos:");
						        senhaUsuario=entrada.nextInt();
						        System.out.print("Confirme Senha:");
						        senhaUsuarioConf=entrada.nextInt();
						        if(senhaUsuarioConf==senhaUsuario) {
						        	System.out.print("Senha válida. Vamos continuar!\n");
						        }else {
						        	System.out.print("Senha invalida.Insira outra senha!\n");
						        };
						        } while (senhaUsuarioConf != senhaUsuario);
						        
						        System.out.println("Escolha 1 para finalizar o cadastro ou 0 para cancelar.");
								escolhaFinalizar=entrada.nextInt();
								limpatela();
									if(escolhaFinalizar==1){
										System.out.println("Cadastro feito com sucesso! Vamos economizar!");
									}else {
										System.out.println("Que pena! Esperamos te ver em uma próxima vez.");
									};
							break;
							//FIM CADASTRO CLIENTE
							//CADASTRO PARCEIRO
							case 2:
								System.out.println("_________________ \nCADASTRO PARCEIRO\nFicaremos felizes em tê-lo como nosso parceiro. Preencha as informações abaixo e um de nossos representantes entrará em contato\n");
								System.out.print("Informe o nome da instituição:");
								nomeInstituicao=entrada.next();
								System.out.print("CNPJ(somente números:");
								cnpjInstituicao=entrada.next();
								System.out.print("Telefone:");
								telInstituicao=entrada.next();
								System.out.print("E-mail:");
								emailInstituicao=entrada.next();
								System.out.print("Informe o nome do responsável pela parceria:");
								nomeResponsavelIns=entrada.next();
								System.out.print("");
								limpatela();
								System.out.print("Escolha 1 para finalizar o cadastro ou 0 para cancelar.");
								escolhaFinalizar=entrada.nextInt();
								limpatela();
									if(escolhaFinalizar==1){
										System.out.println("Recebemos sua solicitação e em breve entraremos em contato. Verifique sua caixa de e-mail.");
									}else {
										System.out.println("Que pena! Esperamos te ver em uma próxima vez.");
									};
							break;
							//FIM CADASTRO PARCEIRO
						};
				break;
				//FIM CADASTRO
				//LOGIN
				case 2:
					do {
						System.out.print("LOGIN \n\nInsira seu email:");
						logEmail=entrada.next();
						System.out.print("Insira senha:");
						logSenha=entrada.nextInt();
						if(logEmail.equals(emailUsuario)){
							if(logSenha==senhaUsuario) {
							}else {
								System.out.println("Senha incorreta!");
							};
						}else {
							System.out.println("Email incorreto.");
						}
					}while (!logEmail.equals(emailUsuario) || logSenha != senhaUsuario);
					limpatela();
					do {
						System.out.println("\n\nAREA DO CLIENTE \n\n1.Ver a oferta do dia\n2.Ver a sugestão de receita para o seu almoço ou jantar de hoje\n3.Sair");
						opcaoArea=entrada.nextInt();
						limpatela();
						switch(opcaoArea) {
							case 1:
								System.out.print("Oferta imperdível do dia: Tomate por apenas R$2,00 kg");
							break;
							
							case 2:
								System.out.print("Molho de tomate caseiro:\n\nIngredientes:\n2 cebolas grandes\n4 dentes de alho\n6 tomates grandes maduros\nOrégano, manjericão, cebolinha e salsa a gosto\nSal a gosto\n\nModo de preparo:\nBata os tomates no liquidificador e vá acrescentando as cebolas, o alho, o orégano e o manjericão.\nColoque em uma panela para ferver até o volume diminuir pela metade.Desligue, coloque sal, cebolinha e salsa a gosto.");
							break;
						}
						System.out.println("\n\nDigite S para voltar ao menu principal. Digite N para voltar ao menu anterior");
						saircliente=entrada.next();
					}while(saircliente.equalsIgnoreCase("n") || saircliente.equalsIgnoreCase("N"));
		
				break;
				//FIM LOGIN
		};//FIM MENU

		System.out.println("\n\nDeseja voltar ao Menu principal?\n\nDigite S para sim\nDigite N para finalizar a sessão");
		menuReturn=entrada.next();
		limpatela();
		}while(menuReturn.equalsIgnoreCase("s") || menuReturn.equalsIgnoreCase("S"));
		//FIM MENU RETURN
		limpatela();
		System.out.println("Sessão Finalizada");
	}
	
	public static void limpatela() {
		System.out.println("\n\n\n"); 
		};
		
};

    