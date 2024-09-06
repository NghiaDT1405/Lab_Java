public class ConvertTemperature {
        private float temp;

        private float convertC2F() {
            return (float) (temp * 1.8 + 32);
        }

        private float convertF2C() {
            return (float) ((temp - 32) / 1.8);
        }

        public void convert(float nhietDo, boolean isToC) {
            this.temp = nhietDo;
            if (isToC) {
                System.out.println("Nhiet do " + nhietDo + " C = " + convertC2F() + " F");
            } else {
                System.out.println("Nhiet do " + nhietDo + " F = " + convertF2C() + " C");
            }
        }
    }
