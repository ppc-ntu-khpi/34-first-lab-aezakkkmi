public class Shirt {
  public int shirtID = 176598; // ���������� �������� ������ ����� �������
  public String description = "-Puma X Mercedes = joke-"; // ����������� ���� �������
  // ���� �������: R=��������, B=����, G=�������, U=�������
  public char colorCode = 'U';
  public double price = 0.0; // ���������� ������� �������
  public int quantityInStock = 0; // ���������� ������� �� �����
  
  // ��� ����� ������ �������� ��� ���������� ��� ������� �� �����
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // ����� ������ displayShirtInformation
} // ����� ����� �����