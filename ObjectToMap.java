public class ObjectToMap {

  public void objToMap() {
        Phone phone = new Phone(19, "DAMI", 45,78);
        Field[] fields = phone.getClass().getDeclaredFields();

        for (Field field : fields) {
            String name = field.getName();
            System.out.println(name);
            String getter = "get" +name.substring(0,1).toUpperCase() + name.substring(1);
            try {
                Method method = phone.getClass().getMethod(getter);
                Object invoke = method.invoke(phone);
                System.out.println(invoke);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
  }
}
