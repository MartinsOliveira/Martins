package horaextra;

public class CaculoHoraExtra {

	public double salario;
	public double quantidade_horas;
	public double hora_aviso;

	
	public double HoraPlantao() {
		
	    return (salario/600)*hora_aviso;
	  
	}
	public double HoraExtra() {

		return (salario / 200) * 1.5 * quantidade_horas;

	}

	public double SalarioBruto() {

		return HoraExtra() + salario + HoraPlantao();
		
	}

	public double DescontoInss() {

		if (SalarioBruto() <= 1751.81) {

			return SalarioBruto() - SalarioBruto() * 8 / 100;

		} else if (SalarioBruto() >= 1751.82 || SalarioBruto() <= 2919.72) {

			return SalarioBruto() - SalarioBruto() * 9 / 100;
		}

		else if (SalarioBruto() >= 2919.73 || SalarioBruto() <= 5839.45) {

			return SalarioBruto() - SalarioBruto() * 11 / 100;

		}
		return DescontoInss();

	}

	public double DescontoIrrf() {

		if (DescontoInss() >= 1903.99 || DescontoInss() <= 2826.65) {

			return DescontoInss() - DescontoInss() * 7.5 / 100;
		}

		else if (DescontoInss() >= 2826.66 || DescontoInss() <= 3751.05) {

			return DescontoInss() - DescontoInss() * 15 / 100;

		}

		else if (DescontoInss() >= 3751.06 || DescontoInss() <= 4664.68) {

			return DescontoInss() - DescontoInss() * 7.5 / 100;

		}

		else if (DescontoInss() > 4664.68) {

			return DescontoInss() - DescontoInss() * 27.5 / 100;

		}
		return DescontoInss();

	}

}