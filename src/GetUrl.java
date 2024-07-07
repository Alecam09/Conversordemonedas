class GetUrl {
    public String generaUrl(String fromCurrency, String toCurrency) {
        String apiKey = "71426d5650e998969d7704e3"; // Tu API key
        return "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + fromCurrency;
    }
}
